
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(!(line = br.readLine()).equals("0")){
			int n = Integer.parseInt(line);
			int count = 0;
			int i=2;
			int res = 0;
			while(count < n){
				if(isPrimeNum(i)){
					count++;
					res += i;
				}
				i++;
			}
			System.out.println(res);
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