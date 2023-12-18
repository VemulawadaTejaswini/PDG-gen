import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer sb = new StringBuffer(S);
		int Q = sc.nextInt();
		for(int i = 0;i < Q;i++){
			int T = sc.nextInt();
			if(T == 1){
				sb = sb.reverse();
			}else{
				int F = sc.nextInt();
				String C = sc.next();
				if(F == 1){
					sb = sb.insert(0,C);
				}else{
					sb = sb.append(C);
				}
			}
		}
		System.out.println(sb.toString());
	}
}