
import java.util.*;
public class Main {
	public static void main(String[] args){
		if (args != null & args.length == 3) {
			int N = Integer.parseInt(args[0]);
			int A = Integer.parseInt(args[1]);
			int B = Integer.parseInt(args[2]);
			int T1 = 0;
			if (1<=N & N<=20) {
				if (1<=A & N<=100) {
					T1 = N * A;
				}
			}
			
			if (T1 >= B) {
				System.out.println(B);
			} else {
				System.out.println(T1);
			}
		}
			
	}
}
