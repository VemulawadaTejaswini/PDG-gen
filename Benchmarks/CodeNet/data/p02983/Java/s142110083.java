import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();

		if(R%2019==0||L%2019==0) {
			System.out.println("0");
			System.exit(0);
		}
		if((R-L)>=2018) {
			System.out.println("0");
			System.exit(0);
		}
		for(int i=L;i<=R;i++) {
			if(i%2019==0) {
				System.out.println("0");
				System.exit(0);
			}
		}
		int l = L%2019;
		int r = R%2019;
		int ans = 2018;
		for(int i=l;i<r;i++) {
			for(int j=i+1;j<=r;j++) {
				int tmp = (i*j)%2019;
				if(tmp<ans) {
					ans = tmp;
				}
			}
		}
		System.out.println(ans);
	}
}