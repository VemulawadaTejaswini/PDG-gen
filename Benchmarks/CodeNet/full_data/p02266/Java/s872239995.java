import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
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

    public class CalcResult {
    		private LinkedList<String> _strList = null;
    		private ArrayList<Integer> _dimensionList = null;
    }

    public int countPosition( LinkedList<String> strList ) {
    		int position = 0;
    		while( !strList.isEmpty() ) {
    			String s = strList.peekFirst();
    			if( "/".equals(s)) {
    				position++;
    			} else if( "\\".equals(s)) {
    				position--;
    			}
    		}

    		return position;
    }

    public void calc( CalcResult result ) {
    		LinkedList<String> strList = result._strList;
    		boolean fromFirst = countPosition(strList) >= 0;
    		int dimension = 0;
    		int position = 0;
    		while( !strList.isEmpty() ) {
    			String s = ( fromFirst ) ? strList.pollFirst() : strList.pollLast();
    			if( "_".equals(s)) {
    				dimension = dimension + 2 * position;
    			} else if( ( fromFirst && "\\".equals(s) ) || ( !fromFirst && "/".equals(s)) ) {
    				position--;
    				dimension = 1 + dimension + 2 * position;
    			} else {
    				dimension = 1 + dimension + 2 * position;
    				position++;
    				if( position != 0 ) {
    					continue;
    				}

    				result._dimensionList.add(dimension);
    			}
    		}
    }

    public LinkedList<String> omitString( LinkedList<String> strList ) {
    		LinkedList<String> charList = new LinkedList<>();
		// 計算に不要な部分を最初に除く
		boolean isFirst = true;
		while( !strList.isEmpty() ) {
			String s = strList.pollFirst();
			if( isFirst && ( "/".equals(s) || "_".equals(s) ) ) {
				continue;
			}

			isFirst = false;
			charList.add(String.valueOf(s));
		}

		LinkedList<String> charList2 = new LinkedList<>();
		// 計算に不要な部分を最初に除く
		isFirst = true;
		while( !charList.isEmpty() ) {
			String s = charList.pollLast();
			if( isFirst && ( "\\".equals(s) || "_".equals(s) ) ) {
				continue;
			}

			isFirst = false;
			charList2.add(String.valueOf(s));
		}

		return charList2;
    }

    public LinkedList<String> toList( String str ) {
    		LinkedList<String> list = new LinkedList<>();
    		for( int ii = 0; ii < str.length(); ii++ ) {
    			char ch = str.charAt(ii);
    			list.add(String.valueOf(ch));
    		}

    		return list;
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		String line = bf.readLine();
    		LinkedList<String> strList = toList(line);
    		CalcResult result = new CalcResult();
    		result._strList = strList;
    		result._dimensionList = new ArrayList<>();

    		while( !result._strList.isEmpty() ) {
    			result._strList = omitString(result._strList);
    			calc(result);
    		}

    		int sum = 0;
    		for( int i = 0; i < result._dimensionList.size(); i++ ) {
    			sum = sum + result._dimensionList.get(i);
    		}
    		System.out.println(sum/2);

    		// 結果を出力する
    		StringBuilder bd = new StringBuilder();
    		bd.append(result._dimensionList.size());
    		for( int i = 0; i < result._dimensionList.size(); i++ ) {
    			bd.append(" ");
    			bd.append(result._dimensionList.get(i)/2);
    		}
    		System.out.println(bd.toString());
    }
}
