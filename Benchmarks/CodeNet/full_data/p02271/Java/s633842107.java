import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

    public ArrayList<Integer> toList( String line ) {
    		ArrayList<Integer> list = new ArrayList<>();
    		if ( line == null || line.length() == 0 ) {
    			return list;
    		}

    		String[] lines = line.split(" ");
    		for( int i = 0; i < lines.length; i++ ) {
    			String element = lines[i];
    			list.add(Integer.valueOf(element));
    		}

    		return list;
    }

    public boolean isCalculable( int mVal, int index, ArrayList<Integer> aList ) {
    		if( mVal == 0 ) {
    			return true;
    		}
    		if( mVal < 0 ) {
    			return false;
    		}

    		if( index >= aList.size()) {
    			return false;
    		}

    		return isCalculable(mVal,index+1,aList) || isCalculable(mVal - aList.get(index).intValue(),index+1,aList);
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		bf.readLine();
    		ArrayList<Integer> aList = toList(bf.readLine());
    		bf.readLine();
    		ArrayList<Integer> mList = toList(bf.readLine());

    		for( Integer mVal : mList ) {
    			boolean isCalculable = isCalculable(mVal.intValue(),0,aList);
    			String msg = isCalculable ? "yes" : "no";
    			System.out.println(msg);
    		}
    }
}
