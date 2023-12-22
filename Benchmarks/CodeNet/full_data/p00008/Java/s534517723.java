import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int c = s.nextInt();
			int ans = check(c);
			System.out.println(ans);
		}
	}
	static int check(int c) {
		int kk = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					for(int l = 0; l < 10; l++) {
						if(i + j + k + l == c) {
							kk++;
						}
					}
				}
			}
		}
		return kk;
	}
}