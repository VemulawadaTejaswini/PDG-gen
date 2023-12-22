import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x=scan.nextInt();
		int s=x%60;
		x=x/60;
		int m=x%60;
		int h=x/60;

		System.out.println(h+":"+m+":"+s);

	}

}