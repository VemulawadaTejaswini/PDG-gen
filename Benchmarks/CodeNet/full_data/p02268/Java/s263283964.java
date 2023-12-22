import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 境界部分には気をつける(そこだけ別で処理するというのもあり)
 * 逆再生することで簡単になることもある
 */
public class Main {
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

    public void exec_body( BufferedReader bf ) throws IOException {
            bf.readLine();
            int[] sAry = toList(bf.readLine(),false);
            bf.readLine();
            int[] tAry = toList(bf.readLine(),false);

            int cnt = 0;
            for( int tVal : tAry ) {
            		int left = 0;
            		int right = sAry.length - 1;
            		while( left <= right ) {
            			int middle = ( left + right ) / 2;
            			int middleVal = sAry[middle];
            			if( middleVal == tVal ) {
            				cnt++;
            				break;
            			} else if ( middleVal > tVal ) {
            				right = middle - 1;
            			} else if( middleVal < tVal ) {
            				left = middle +1;
            			}
            		}
            }

            System.out.println(cnt);
    }

    public int[] toList( String str, boolean isBanhei ) {
            String[] elements = str.split(" ");
            int arysize = elements.length + ( (isBanhei) ? 1 : 0 );
            int[] ret = new int [arysize];
            for( int i = 0; i < elements.length; i++ ) {
                ret[i] = Integer.valueOf(elements[i]);
            }

            return ret;
    }
}
