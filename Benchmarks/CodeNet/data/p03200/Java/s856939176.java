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
		long ans2 = 0;
		int c = SS.length-1;

		if(a[SS.length-1] == -1) {
			for(int i =SS.length-2; i >= 0; i--) {
				if(a[i] == 1) {
					ans2 += c-i;
					c--;
				}
			}
		}else {
			while(c != 0) {
				c --;
				int co = c;
				if(a[co] == -1) {
					for(int i = co; i >= 0; i--) {
						if(a[i] == 1) {
							ans2 += c-i;
							c--;
							
						}
					}
					break;
				}
			}
		}

		System.out.println(ans2);
		sc.close();
	}
}

