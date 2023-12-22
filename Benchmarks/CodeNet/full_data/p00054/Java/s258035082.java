import java.util.*;
import java.io.*;

public class Main{
	public static int sum(int a, int b, int n){
		int sum = 0;
		while( n-- > 0 ){
			a %= b;
			sum += a*10/b;
			a = a*10%b;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				int n = stdIn.nextInt();
				result.add(sum(a, b, n));
			}
			
			for(Integer sum : result){
				System.out.println(sum);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}