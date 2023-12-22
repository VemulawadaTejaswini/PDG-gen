import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		//3????????´??°a,b,c?????\???
		String[] num = str.split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);

		while(a < b && b < c){
		 b = a;
		 c = b;
		 }
		System.out.println(a +  " " + b  + " "  + c);

	}

}