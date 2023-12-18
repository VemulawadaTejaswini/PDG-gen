iimport java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		if(a == 0) {
			if(b >= 100) {
				for(int i = 100;i <= b;i ++) {
				if(b % 100 == 0) cnt ++;
				}
				System.out.println(b+cnt);
			}else {
				System.out.println(b);
			}
		}else{
			int c = 1;
			for(int i = 0;i < a;i ++) {
				c = c * 100;
			}
			System.out.println(c * b);
		}
	}
}