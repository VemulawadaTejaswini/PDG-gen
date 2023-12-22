import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			String b = Integer.toBinaryString(n);
			int k = Integer.bitCount(n);
			int t = 1;
			int c = 1;
			for(int i = b.length() - 1; i >= 0; i--) {
				if(b.charAt(i) == '1') {
					if(c == k) {
						System.out.println(t);
					}else {
						System.out.printf("%d ", t);
						c++;
					}
				}
				t *= 2;
			}
		}
		sc.close();
	}
}
