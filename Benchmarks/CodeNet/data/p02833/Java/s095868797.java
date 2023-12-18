import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	/*	BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double num =Integer.parseInt(str); */
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		if(num%2==1){
			System.out.println(0);
		}
		else {
			long sum=0;
			for (int i = 1; i <=30; i++) {
				sum += Math.floor((num/(2*Math.pow(5,i))));
			}
			System.out.println(sum);
		}
	}
}