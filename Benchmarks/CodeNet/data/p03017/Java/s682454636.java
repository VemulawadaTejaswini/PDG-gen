import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int A = Integer.parseInt(line[1])-1;
		int B = Integer.parseInt(line[2])-1;
		int C = Integer.parseInt(line[3])-1;
		int D = Integer.parseInt(line[4])-1;
		String[] s = reader.readLine().split("");
		boolean sharp2flag = false;
		boolean ten3flag = false;
		boolean CdainariD = false;
		for (int i = B; i < C; i++) {
			if (s[i].equals("#") && s[i+1].equals("#")) {
				sharp2flag = true;
			}
			//System.out.println("i=" + i + ", C-1=" + (C-1));    /////////////////
			if (i < C-1 && s[i].equals(".") && s[i+1].equals(".") && s[i+2].equals(".")) {
				ten3flag = true;
			}
		}
		if (Math.max(C, D) == C) {   //A<B, A<C, B<D
			CdainariD = true;
		}
		//System.out.println("ten3flag=" + ten3flag);    /////////////////
		
		if (sharp2flag) {
			System.out.println("No");
		}
		else if (CdainariD && ten3flag) {
			System.out.println("Yes");
		}
		else if (!CdainariD && ten3flag) {
			System.out.println("Yes");
		}
		else if (CdainariD && !ten3flag) {
			System.out.println("No");
		}
		else if (!CdainariD && !ten3flag) {
			System.out.println("Yes");
		}
	}
}