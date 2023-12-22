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
    		int[] sList = toList(bf.readLine());
    		bf.readLine();
    		int[] tList = toList(bf.readLine());

    		int cnt = 0;
    		for( int tval : tList ) {
    			for( int sval : sList ) {
    				if( tval == sval ) {
    					cnt++;
    					break;
    				}
    			}
    		}

    		System.out.println( cnt );
    }

    public int[] toList( String str ) {
    		String[] vals = str.split(" ");
    		int[] ret = new int[vals.length];
    		for( int i = 0; i < ret.length; i++ ) {
    			ret[i] = Integer.valueOf(vals[i]);
    		}

    		return ret;
    }
}
