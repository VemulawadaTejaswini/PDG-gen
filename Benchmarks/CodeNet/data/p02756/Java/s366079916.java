import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		//int sum = 0;
		boolean R = false;
		for(int i = 0; i < Q; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				R = !R;
			}
			else if(q == 2) {
				int F = sc.nextInt();
				if(F == 1) {
					if(R == true) {
						String C = sc.next();
						S = S + C;
					}
					else{
						String C = sc.next();
						S = C + S;
					}
				}
				else if(F == 2){
					if(R == true) {
						String C = sc.next();
						S = C + S;
					}
					else{
						String C = sc.next();
						S = S + C;
					}
				}
			}
		}
		if(R == true) {
			StringBuffer str = new StringBuffer(S);
			S = str.reverse().toString();
		}
		System.out.println(S);
	}	
}