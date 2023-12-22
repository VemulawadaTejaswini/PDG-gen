import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T = sc.nextInt();
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int B = sc.nextInt();
		String[] ss = sc.next().split("");
		for (int i=0; i<ss.length; i++) {
			if (ss[i].equals("N")) {
				int[] temp = {T,S,E,W,N,B};
				T = temp[1];
				N = temp[0];
				B = temp[4];
				S = temp[5];
			}
			else if (ss[i].equals("E")) {
				int[] temp = {T,S,E,W,N,B};
				T = temp[3];
				E = temp[0];
				B = temp[2];
				W = temp[5];
			}
			else if (ss[i].equals("S")) {
				int[] temp = {T,S,E,W,N,B};
				T = temp[4];
				N = temp[5];
				B = temp[1];
				S = temp[0];
			}
			else if (ss[i].equals("W")) {
				int[] temp = {T,S,E,W,N,B};
				T = temp[2];
				E = temp[5];
				B = temp[3];
				W = temp[0];
			}
		}
		System.out.println(T);
	}
}			
