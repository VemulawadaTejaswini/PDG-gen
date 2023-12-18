import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");

		int d = Integer.parseInt(line[0]);
		int n = Integer.parseInt(line[1]);

		int n1 = 0;
		int n2 = 0;

		if(n>=(100^2)){
			n2 = n/((int)Math.pow(100,2));
//			System.out.println(n2);
		}
		if(n>=100){
			n1 = n/100 ;
//			System.out.println(n2);
		}
		n = n+n1+n2;

		System.out.println((int)Math.pow(100,d)*n);


	}
}
