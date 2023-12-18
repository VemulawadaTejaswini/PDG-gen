import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int l[] = new int[Q];
		int r[] = new int[Q];
		for(int i =0 ; i<Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		char q[] = S.toCharArray();
		
		for(int j = 0; j<Q;j++) {
			boolean flag = false; //ACGTの時はtrue
			int counter = 0;
		for(int i =l[j]-1; i<r[j]; i++) {
			if(!flag&&q[i]=='A') {
				flag = true;
				continue;
			}
			if(flag&&q[i]=='C') {
				counter++;
			}
			flag = false;
			
			
			
		}
		
		System.out.println(counter);
		}
		
		
		
	}
}