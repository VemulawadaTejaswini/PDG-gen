import java.util.*;
import java.io.*;

public class Main{
	public static int eqaualValue(char[] x, int i, int j){
		if( x[i] == x[i+j] && x[i] == x[i+2*j] ){
			if( x[i] == 'o' ){
				return 0;
			} else if( x[i] == 'x' ){
				return 1;
			} 
		}
		return -1;
	}
	
	public static String judge(String str){
		char[] x = str.toCharArray();
		for(int i = 0; i < str.length(); i++){
			x[i] = str.charAt(i);
		}
		for(int i = 0; i < 3; i++){
			if( eqaualValue(x, i, 3) == 0 ){
				return "o";
			} else if( eqaualValue(x, i, 3) == 1 ){
				return "x";
			}
		}
		for(int i = 0; i < 3; i++){
			if( eqaualValue(x, 3*i, 1) == 0 ){
				return "o";
			} else if( eqaualValue(x, 3*i, 1) == 1 ){
				return "x";
			}
		}
		if( eqaualValue(x, 0, 4) == 0 ){
			return "o";
		} else if( eqaualValue(x, 0, 4) == 1 ){
			return "x";
		}
		if( eqaualValue(x, 2, 2) == 0 ){
			return "o";
		} else if( eqaualValue(x, 2, 2) == 0 ){
			return "x";
		}
		return "d";
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				result.add(judge(str));
			}
			for(String s : result){
				System.out.println(s);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}