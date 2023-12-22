import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		for (int i = 0;; i++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==0 && y==0)
				break;
			if(x>y)
				System.out.println(y+" "+x);
			else
				System.out.println(x+" "+y);
		}

	}

}