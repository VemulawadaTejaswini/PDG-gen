import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		
		if(n > m){
			int tmp = n;
			n = m;
			m = tmp;
			
		}
		
		if(n == 1){
			if(m == 1){
				System.out.println(1);
			}
			else {
				System.out.println(m - 2);
			}
			return;
		}
		System.out.println((m - 2)*(n - 2));

	}

}
