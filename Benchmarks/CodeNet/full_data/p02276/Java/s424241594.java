import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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

    public int[] toList( String str ) {
        String[] elements = str.split(" ");
        int[] ret = new int [elements.length];
        for( int i = 0; i < elements.length; i++ ) {
            ret[i] = Integer.valueOf(elements[i]);
        }

        return ret;
    }

    public void print( int[] ary ) {
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

    public int partition( int[] ary, int p, int r ) {
    		int rVal = ary[r];
    		int changeIndex = p -1;
    		for( int ii = p; ii < r; ii++) {
    			if( ary[ii] <= rVal) {
    				changeIndex++;
    				int changeVal = ary[changeIndex];
    				ary[changeIndex] = ary[ii];
    				ary[ii] = changeVal;
    			}
    		}

    		changeIndex++;
    		ary[r] = ary[changeIndex];
    		ary[changeIndex] = rVal;

    		return changeIndex;
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		bf.readLine();
    		int[] ary = toList(bf.readLine());
    		int changeIndex = partition(ary,0,ary.length -1);
    		StringBuilder bd = new StringBuilder();
    		for( int ii = 0 ; ii < ary.length; ii++ ) {
    			if( ii != 0 ) {
    				bd.append(" ");
    			}

    			if( ii == changeIndex ) {
    				bd.append("[");
    				bd.append(ary[ii]);
    				bd.append("]");
    			} else {
    				bd.append(ary[ii]);
    			}
    		}
		System.out.println(bd.toString());
    }
}
