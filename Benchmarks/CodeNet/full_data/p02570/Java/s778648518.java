import java.util.Scanner;
public class Main {
	
		public static void main(String[] args) {
			try(Scanner sc = new Scanner(System.in)){
				int[] s = new int[sc.nextInt()];
				long d = 0;
				for(int x = 0;x < s.length;++x) {
					s[x] = sc.nextInt();
				}
				for(int y= 0;y < s.length;y++ ) {
					for(int x = y+1;x < s.length;x++) {
						d = d + s[y]*s[x];
					}
					d = d % 1000000007;
				}
				System.out.println(d);
			}
		}
}