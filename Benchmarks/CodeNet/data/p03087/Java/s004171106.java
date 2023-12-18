import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		char q[] = S.toCharArray(); //これを使う
		int l[] = new int[Q];
		int r[] = new int[Q];
		int counter[] = new int[Q];
		
		for(int i = 0; i<Q; i++) {
			l[i] = sc.nextInt()-1;
			r[i] = sc.nextInt()-1;
			
		}
		
		for(int i = 0;i<N-1;i++) {
			if(q[i]=='A') {
				if(q[i+1]=='C') {
					for(int c = 0; c<Q;c++)
					if(l[c]<=i&&i+1<=r[c])counter[c]++;
				}
				
			}
			
		}
		for(int w = 0; w<Q; w++)
		System.out.println(counter[w]);
		
		
	}}