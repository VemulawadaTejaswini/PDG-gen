import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int k = Integer.parseInt(br.readLine());
		long result = 0;
		int ketasu = n.length();
		int a1 = Integer.parseInt(n.substring(0, 1));
		int a2 = (ketasu >=2 ? Integer.parseInt(n.substring(1, 2)):0);
		int a3 = (ketasu >=3 ? Integer.parseInt(n.substring(2, 3)):0);
		if(ketasu == 1) {
			result = a1;
		}else if(k == 1) {
			result += (ketasu-1)*9;
			result += a1;
		}else if(k == 2) {
			result += (ketasu > 2 ? calcCombination(ketasu-1, 2)*9*9 : 0);
			result += (a1-1)*calcCombination(ketasu-1, 1)*9;
			result += (ketasu > 2 ? calcCombination(ketasu-2, 1)*9:0);
			result += a2;
		}else { //k == 3
			result += (ketasu > 3 ? calcCombination(ketasu-1, 3)*9*9*9 : 0);
			result += (a1-1)*calcCombination(ketasu-1, 2)*9*9;
			result += (ketasu > 3 ? calcCombination(ketasu-2, 2)*9*9 : 0);
			result += (a2-1)*9*calcCombination(ketasu-2, 1);
			result += (ketasu > 3 ? calcCombination(ketasu-3, 1)*9 : 0);
			result += a3;
		}
		System.out.println(result);
		
	}
	public static long calcCombination( int n, int m) {
	    long c = 1;
	    m = ( n - m < m ? n - m : m );
	    for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
	        c *= ns;
	        c /= ms;
	    }
	    return c;
	}


}
