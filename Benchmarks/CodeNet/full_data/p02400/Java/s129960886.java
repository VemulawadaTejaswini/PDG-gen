import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		String[] stra = str.split(" ");
		
		int a = Integer.parseInt(stra[0]);
		double p = 3.1415926535897932384626433 ;
		System.out.printf("%.8f %.8f",2*p*a,a*a*p);
	}

}