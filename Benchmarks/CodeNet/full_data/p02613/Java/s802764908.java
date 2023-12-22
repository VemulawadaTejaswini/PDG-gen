import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] S = new String[N];
		int a=0,w=0,t=0,r=0;
		String AC = "AC";
		String WA = "WA";
		String TLE = "TLE";
		String RE = "RE";
		
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
		}
		
		for(int i=0;i<N;i++) {
			if(S[i].equals(AC)) {
				a++;
			}else if(S[i].equals(WA)) {
				w++;
			}else if(S[i].equals(TLE)) {
				t++;
			}else if(S[i].equals(RE)) {
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