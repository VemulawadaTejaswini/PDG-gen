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
		int[] num = new int[n];
		for(int i = 0; i < n-1; i++) {
			if(s[i].equals("A")) {
				if(s[i+1].equals("C"))
					ac[i] = true;
			}
		}
		num[0] = 0;
		for(int i = 1; i < n; i++) {
			num[i] = num[i-1];
			if(ac[i-1]) num[i] += 1;		
		}
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			System.out.println(num[r[i]-1]-num[l[i]-1]);
		}
	}

}