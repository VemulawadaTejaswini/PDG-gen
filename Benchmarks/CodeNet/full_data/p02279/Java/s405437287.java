import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 * 境界部分には気をつける(そこだけ別で処理するというのもあり)
 * 逆再生することで簡単になることもある
 */
public class Main {
	public int cnt = 0;
	public static final BigDecimal TWO = new BigDecimal(2);
	public static final BigDecimal THREE = new BigDecimal(3);

    public Main() {
    }

    public static void main(String[] args ) {
            Main main = new Main();
            main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            exec_body(bf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if( bf != null ) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class Node {
    		int num = 0;
    		Node parent = null;
    		ArrayList<Node> nodes = new ArrayList<Node>();
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		String line = bf.readLine();
    		int nodeLength = Integer.parseInt(line);
    		Node[] nodes = new Node[nodeLength];
    		for( int ii = 0; ii < nodeLength; ii++ ) {
    			Node node = new Node();
    			node.num = ii;
    			nodes[ii] = node;
    		}

    		int lineCnt = 0;
    		do {
    			line = bf.readLine();
    			String[] lines = line.split(" ");
    			if( !"0".equals(lines[1]) ) {
        			int parentNum = Integer.parseInt(lines[0]);
        			Node parent = nodes[parentNum];
        			for( int ii = 2; ii < lines.length; ii++ ) {
        				int childNum = Integer.parseInt(lines[ii]);
        				Node child = nodes[childNum];
        				child.parent = parent;
        				parent.nodes.add(child);
        			}
    			}
    			lineCnt++;
    		} while( lineCnt < nodeLength );

    		for( int ii = 0; ii < nodes.length; ii++ ) {
    			// node num
    			Node node = nodes[ii];
    			StringBuilder bld = new StringBuilder();
    			bld.append("node ");
    			bld.append(node.num);

    			// parent
    			bld.append(": parent = ");
    			int parentNum = ( node.parent == null ) ? -1 : node.parent.num;
    			bld.append(parentNum);

    			// depth
    			bld.append(", depth = ");
    			bld.append(getDepth(node));
    			bld.append(", ");

    			// type
    			if( parentNum == -1 ) {
    				bld.append("root, ");
    			} else if( node.nodes.isEmpty() ) {
    				bld.append("leaf, ");
    			} else {
    				bld.append("interna node, ");
    			}

    			// childs
    			bld.append(" [");
    			for( int kk = 0; kk < node.nodes.size(); kk++ ) {
    				if( kk != 0) {
    					bld.append(", ");
    				}
    				Node childNode = node.nodes.get(ii);
    				bld.append(childNode.num);
    			}
    			bld.append("]");
    			System.out.println(bld.toString());
    		}
    }

    int getDepth( Node node ) {
    		int depth = 0;
    		Node parent = node.parent;
    		while( parent != null ) {
    			parent = node.parent;
    			depth++;
    		}

    		return depth;
    }

    public int max( int[] ary ) {
    		int ret = Integer.MIN_VALUE;
    		for( int ii = 0; ii < ary.length; ii++ ) {
    			if( ret < ary[ii] ) {
    				ret = ary[ii];
    			}
    		}

    		return ret;
    }

    public int min( int[] ary ) {
		int ret = Integer.MAX_VALUE;
		for( int ii = 0; ii < ary.length; ii++ ) {
			if( ret > ary[ii] ) {
				ret = ary[ii];
			}
		}

		return ret;
    }

    public static int[] toIList( String str ) {
        String[] elements = str.split(" ");
        int[] ret = new int [elements.length];
        for( int i = 0; i < elements.length; i++ ) {
            ret[i] = Integer.valueOf(elements[i]);
        }

        return ret;
    }

    public static void print( int[] ary ) {
    		if( ary == null || ary.length == 0 ) {
    			return;
    		}

    		StringBuilder bd = new StringBuilder();
    		for( int i = 0; i < ary.length; i++ ) {
    			if( i != 0 ) {
    				bd.append(" ");
    			}
    			bd.append(ary[i]);
    		}

    		System.out.println(bd.toString());
    }
}
