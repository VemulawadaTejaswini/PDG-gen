import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i=1;i<N+1;i++) {
			String I = Integer.toString(i);
			int length = I.length();
			if(length%2==1) {
				ans++;
			}
		}
		System.out.println(ans);


	}
}
