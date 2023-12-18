import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		
		if(M == 0) System.out.println(0 +" " + 0);
		else {
			int ac=0,wa = 0;
			boolean bb;
			
			int bc = sc.nextInt();
			String str = sc.next();
			if(str.equals("WA")) {
				wa = 1;
				bb = false;
			}else{
				ac = 1;
				bb = true;
			}
			for(int i = 0; i < M-1; i++) {
				int c = sc.nextInt();
				str = sc.next();
				if(c == bc) {
					if(!bb) {
						if(str.equals("WA")) {
							wa++;
						}else {
							ac++;
							bb = true;
						}
					}
				}else {
					if(str.equals("WA")) {
						wa++;
						bb = false;
					}else {
						ac++;
						bb = true;
					}
				}
				bc = c;
			}
			System.out.println(ac +" " + wa);
		}
    }
}