import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] SS = s.split("");
		int[] a = new int[SS.length];
		for(int i = 0; i < SS.length; i++) {
			if(SS[i].equals("B")) {
				a[i] =1;
			}else {
				a[i] = -1;
			}
		}
		int ans1 = 0;
		int ans2 = 0;
		int c = 0;
		if(a[0] == 1) {
			for(int i = 1; i < SS.length; i++) {
				if(a[i] == -1) {
					ans1 += i-c;
					c++;
				}
			}
		}else {
			for(int i = 1; i < SS.length; i++) {
				if(a[i] == 1) {
					ans1 += i-c;
					c++;
				}
			}
		}
		if(a[SS.length-1] == 1) {
			c = SS.length-1;
			for(int i =SS.length-1; i >= 1; i--) {
				if(a[i] == -1) {
					ans2 += c-i;
					c--;
				}
			}
		}else {
			c = SS.length-1;
			for(int i =SS.length-1; i >= 1; i--) {
				if(a[i] == 1) {
					ans2 += c-i;
					c--;
				}
			}
		}

		System.out.println(Math.max(ans1,  ans2));
		sc.close();
	}
}

