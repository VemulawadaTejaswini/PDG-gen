import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String S = sc.next();
		String[] s = S.split("");
		int[] l = new int[q];
		int[] r = new int[q];
		boolean[] ac = new boolean[n];
		for(int i = 0; i < n-1; i++) {
			if(s[i].equals("A")) {
				if(s[i+1].equals("C"))
					ac[i] = true;
			}
		}
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			int answer = 0;
			for(int j = l[i]-1; j < r[i]-1; j++) {
					if(ac[j]) answer += 1;		
			}
			System.out.println(answer);
		}
	}

}