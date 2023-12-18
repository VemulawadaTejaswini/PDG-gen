import java.util.*;

public class Main {

	public static void main(String[] args) {
		int ans = -1;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		
		outside:{
			for(int i = 0 ; i<M*N ; i++) {
				if((i%M)==0) {
					if((i%N)==0) {
						char c1 = S.charAt(i%M);
						char c2 = S.charAt(i%N);
						String s1 = String.valueOf(c1);
						String s2 = String.valueOf(c2);
						if(!(s1.equals(s2))) {
							break outside;
						}
						
					}
				}
				
			}
			flag = true;
		}
		
		if(flag) {
			int temp;
			while((temp = N%M)!=0) {
				N = M;
				M = temp;
			}
			ans =  (int)(N);
		}
		
		System.out.println(ans);
		sc.close();
		

	}

}