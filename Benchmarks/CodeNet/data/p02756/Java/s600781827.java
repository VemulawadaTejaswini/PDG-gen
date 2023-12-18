import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		StringBuffer str = new StringBuffer(S);
		int Q = Integer.parseInt(scan.next());
		int T = 0; 
		int F = 0;
		String C = "";

		for (int i = 0; i < Q; i++){
			T = Integer.parseInt(scan.next());
			if (T == 1){
				str.reverse();
			}else if (T == 2){
				F = Integer.parseInt(scan.next());
				C = scan.next();
				if(F == 1){
					str.insert(0, C);
				}else if (F == 2){
					str.append(C);
				}
			}
		}
		System.out.println(str);
	}
}