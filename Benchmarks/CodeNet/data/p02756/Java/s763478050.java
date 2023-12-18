import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		int t,f;
		boolean reverse = false;
		for (int i = 0; i < q; i++) {
			t = sc.nextInt();
			if(t==1) {
				reverse = !reverse;
			}else if(t==2){
				f = sc.nextInt();
				if(!reverse) {
					if(f==1) {
						s = sc.next() + s;
					}else {
						s += sc.next();
					}
				}else {
					if(f==1) {
						s += sc.next();
					}else {
						s =sc.next() + s;
					}
				}
			}
		}
		if(!reverse) System.out.println(s);
		else{
			StringBuilder sb = new StringBuilder(s);
			System.out.println(new String(sb.reverse()));
		}
		sc.close();
	}
}