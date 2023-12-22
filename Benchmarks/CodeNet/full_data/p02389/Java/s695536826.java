import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a , b;
		String str = br.readLine();
		String strARY[] = str.split(" ");
		
		a= Integer.parseInt(strARY[0]);
		b = Integer.parseInt(strARY[1]);
		
		System.out.println((a*b) + " " + (a+b)*2);
		
		
	
	}
}