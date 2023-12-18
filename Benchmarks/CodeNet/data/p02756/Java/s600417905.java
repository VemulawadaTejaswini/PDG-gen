import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb = new StringBuilder(S);
		int Q = sc.nextInt();
		boolean flg = true;
		for(int i = 0;i < Q;i++){
			int T = sc.nextInt();
			if(T == 1){
				flg = !flg;
			}else{
				int F = sc.nextInt();
				String C = sc.next();
				if(F == 1){
					if(flg){
						sb = sb.insert(0,C);
					}else{
						sb = sb.append(C);
					}
				}else{
					if(flg){
						sb = sb.append(C);
					}else{
						sb = sb.insert(0,C);
					}
				}
			}
		}
		if(flg == false){
			sb = sb.reverse();
		}
		System.out.println(sb.toString());
	}
}