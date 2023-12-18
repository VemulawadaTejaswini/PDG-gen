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
		boolean flag = false;

		for (int i = 0; i < Q; i++){
			T = Integer.parseInt(scan.next());
			if (T == 1){
				flag = !flag;
			}else if (T == 2){
				F = Integer.parseInt(scan.next());
				C = scan.next();
				if(F == 1 ^ flag){
					str.insert(0, C);
				}else {
					str.append(C);
				}
			}
		}
		if (flag){
			str.reverse();
		}
		System.out.println(str);
	}
}