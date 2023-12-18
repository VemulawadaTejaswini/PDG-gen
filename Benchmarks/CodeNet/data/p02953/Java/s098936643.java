import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] H = new int[N];

		for(int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		if(N==1) {
			System.out.println("Yes");
		} else {
			if(N==2) {
				if(H[0]-H[1]<2) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				boolean flg = true;
				for(int i=1;i<N-1;i++) {
					if(H[i-1]-H[i]<=1&&H[i-1]-H[i+1]<=1) {
						flg = true;
					} else {
						flg = false;
					}
				}
				if(flg) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
