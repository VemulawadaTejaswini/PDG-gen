import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			if(str == null || str == ""){
				break;
			}
			int input = Integer.parseInt(str);
			int count = 0;
			
			for (int i = 1; i <= input; i++) {
				if(isPrimeNum(i)){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	static boolean isPrimeNum( int x ) {
		if( x == 2 ) return true;
		if( x < 2 || x % 2 == 0 ) return false;
		for( int n = 3; n <= Math.sqrt((double)x); n += 2 )
			if( x % n == 0 ) return false;
		return true;
	}
}