import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==0 && y==0)
				break;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}