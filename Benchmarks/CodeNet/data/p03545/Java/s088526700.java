import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[]ar = stdIn.next().split("");
		
		int[] a = new int[4];
		
		for(int i = 0; i < ar.length; i++) {
			a[i] = Integer.parseInt(ar[i]);
		}
		
		
		
		String[] f = {"+","-"};
		
		for(int bit = 0; bit <(1 << 3); bit++) {
			int ans = a[0];
			String b = "";
			for(int i = 0; i < 3; i++) {
				if(((bit >> i) & 1) == 1) {
					ans += a[ar.length-i-1];
					b += String.valueOf(a[i])+"+";
				}else {
					ans -= a[ar.length-i-1];
					b += String.valueOf(a[i])+"-";
					
				}
			}
			if(ans == 7) {
				b+=String.valueOf(a[3])+"=7";
				System.out.println(b);
				return;
			}
			
		}
		
		
	}

}
