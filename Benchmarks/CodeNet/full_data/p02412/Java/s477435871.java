
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0) {
				System.out.println("???????????????");
				break;
			}

			int count = 0;
			for(int i = 1; i <= n-2; i++) {
				for(int j = i+1; j <= n-1; j++) {
					for(int k = j+1; k <= n; k++) {
						if(i + j + k == x) {
				//			System.out.println("i : "+ i);
				//			System.out.println("j : "+ j);
				//			System.out.println("k : "+ k);
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}