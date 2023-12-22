import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] S = new String[N];
		char c;
		int a=0,w=0,t=0,r=0;
		
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
		}
		
		for(int i=0;i<N;i++) {
			c = S[i].charAt(0);
			if(c=='A') {
				a++;
			}else if(c=='W') {
				w++;
			}else if(c=='T') {
				t++;
			}else if(c=='R') {
				r++;
			}
		}
		System.out.println("AC × "+a);
		System.out.println("WA × "+w);
		System.out.println("TLE × "+t);
		System.out.println("RE × "+r);
		
		sc.close();
	}

}