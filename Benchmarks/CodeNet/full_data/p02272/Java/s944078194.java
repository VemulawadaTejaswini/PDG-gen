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

    public void merge( int[] ary, int left, int right, int middle ) {
    		int[] leftAry = new int[middle-left+1+1];
    		for( int ii = 0; ii < leftAry.length-1; ii++ ) {
    			leftAry[ii] = ary[ii+left];
    		}
    		leftAry[leftAry.length-1] = Integer.MAX_VALUE;

    		int[] rightAry = new int[right-middle+1];
    		for( int ii = 0; ii < rightAry.length-1; ii++ ) {
    			rightAry[ii] = ary[ii+middle+1];
    		}
    		rightAry[rightAry.length -1]  = Integer.MAX_VALUE;

    		int curLeft = 0;
    		int curRight = 0;
    		for( int ii = left; ii <= right; ii++ ) {
    			cnt++;
    			int curLeftVal = leftAry[curLeft];
    			int curRightVal = rightAry[curRight];
    			if( curLeftVal <= curRightVal ) {
    				ary[ii] = curLeftVal;
    				curLeft++;
    			} else {
    				ary[ii] = curRightVal;
    				curRight++;
    			}
    		}
    }

    public void mergeSort( int[] ary, int left, int right ) {
    		// ここで終了
    		if( left >= right ) {
    			return;
    		}

    		int medium = (right + left)/2;
    		mergeSort(ary,left,medium);
    		mergeSort(ary,medium+1,right);
    		merge(ary,left,right,medium);
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		bf.readLine();
    		int[] ary = toList(bf.readLine());
    		mergeSort(ary,0,ary.length-1);
    		print(ary);
    		System.out.println(cnt);
    }
}
