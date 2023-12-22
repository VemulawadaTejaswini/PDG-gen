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
    		Node right = null;
    		Node left = null;
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
    			int num = Integer.parseInt(lines[0]);
    			Node node = nodes[num];
    			int left = Integer.parseInt(lines[1]);
    			if( left != -1 ) {
    				Node leftNode = nodes[left];
    				node.left=leftNode;
    				leftNode.parent = node;
    			}
    			int right = Integer.parseInt(lines[2]);
    			if( right != -1 ) {
    				Node rightNode = nodes[right];
    				node.right=rightNode;
    				rightNode.parent = node;
    			}
    			lineCnt++;
    		} while( lineCnt != nodeLength );

    		Node rootNode = getRoot(nodes[0]);
    		{
        		System.out.println("Preorder");
        		ArrayList<Node> preorderNodes = new ArrayList<Node>();
        		depthFirstSearch(rootNode,preorderNodes);
        		StringBuilder bld = new StringBuilder();
        		for( int ii = 0; ii < preorderNodes.size(); ii++ ) {
        			bld.append(" ");
        			bld.append(preorderNodes.get(ii).num);
        		}
        		System.out.println(bld.toString());
    		}

    		{
        		System.out.println("Inorder");
        		ArrayList<Node> orderNodes = new ArrayList<Node>();
        		inorderSearch(rootNode,orderNodes);
        		StringBuilder bld = new StringBuilder();
        		for( int ii = 0; ii < orderNodes.size(); ii++ ) {
        			bld.append(" ");
        			bld.append(orderNodes.get(ii).num);
        		}
        		System.out.println(bld.toString());
    		}

    		{
        		System.out.println("Postorder");
        		ArrayList<Node> orderNodes = new ArrayList<Node>();
        		postOrder(rootNode,orderNodes);
        		StringBuilder bld = new StringBuilder();
        		for( int ii = 0; ii < orderNodes.size(); ii++ ) {
        			bld.append(" ");
        			bld.append(orderNodes.get(ii).num);
        		}
        		System.out.println(bld.toString());
    		}
    }

    Node getRoot( Node node ) {
    		while( node.parent != null ) {
    			node = node.parent;
    		}
    		return node;
    }

    void postOrder( Node parent, ArrayList<Node> nodeList ) {
		Node left = parent.left;
		if(left != null ) {
			inorderSearch(left,nodeList);
		}
		Node right = parent.right;
		if(right != null ) {
			inorderSearch(right,nodeList);
		}
		nodeList.add(parent);
    }

    void inorderSearch( Node parent, ArrayList<Node> nodeList ) {
    		Node left = parent.left;
    		if(left != null ) {
    			inorderSearch(left,nodeList);
    		}
    		nodeList.add(parent);
    		Node right = parent.right;
    		if(right != null ) {
    			inorderSearch(right,nodeList);
    		}
    }

    void depthFirstSearch( Node parent, ArrayList<Node> nodeList ) {
		nodeList.add(parent);
		Node leftNode = parent.left;
		if( leftNode != null ) {
			depthFirstSearch(leftNode,nodeList);
		}
		Node rightNode = parent.right;
		if( rightNode != null ) {
			depthFirstSearch(rightNode,nodeList);
		}
    }

    int getDepth( Node node ) {
    		int depth = 0;
    		while( node.parent != null ) {
    			node = node.parent;
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

    		System.out.print(bd.toString());
    }
}
