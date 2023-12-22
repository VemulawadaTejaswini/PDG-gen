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
    		int[] sList = toList(bf.readLine(),true);
    		bf.readLine();
    		int[] tList = toList(bf.readLine(),false);

    		int cnt = 0;
    		for( int tval : tList ) {
    			int i = 0;
    			sList[sList.length-1] = tval;
    			while( sList[i] != tval ) {
    				i++;
    			}
    			if( i != sList.length ) {
    				cnt++;
    			}
    		}

    		System.out.println( cnt );
    }

    public int[] toList( String str,boolean expandAry ) {
    		String[] vals = str.split(" ");
    		int size = vals.length + ((expandAry)?1:0);
    		int[] ret = new int[size];
    		for( int i = 0; i < vals.length; i++ ) {
    			ret[i] = Integer.valueOf(vals[i]);
    		}

    		return ret;
    }
}
