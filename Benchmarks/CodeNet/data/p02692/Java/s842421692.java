import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] v = new int[3];
		for(int i=0; i<3; i++)
			v[i] = sc.nextInt();
		
		int[] q = new int[N];
		for(int i=0; i<N; i++) {
			String s = sc.next();
			q[i] = s.equals("AB") ? 2 : (s.equals("BC") ? 0 : 1);
		}

		int[] ans = new int[N];

		String ABC = "ABC";
		
		for(int i=0; i<N; i++) {
			int q0 = q[i];
			int q1 = (q[i]+1)%3;
			int q2 = (q[i]+2)%3;
			int v0 = v[q0];
			int v1 = v[q1];
			int v2 = v[q2];
			if(v1==0 && v2==0) {
				ans = null;
				break;
			} else if(v1==0 && v2>0) {
				ans[i] = q1;
			} else if(v1>0 && v2==0) {
				ans[i] = q2;
			} else if(v1==1 && v2==1) {
				if(v0==0 && i<N-1) {
					if(v[i+1]==(v[i]+1)%3) {
						ans[i] = q2;
					} else {
						ans[i] = q1;
					}
				} else {
					ans[i] = q1;
				}
			} else {
				if(v1 < v2) {
					ans[i] = q1;
				} else {
					ans[i] = q2;
				}
			}
			if(ans[i]==q1) {
				v[q1]++;
				v[q2]--;
			} else {
				v[q1]--;
				v[q2]++;
			}
		}

		if(ans==null) {
			pw.println("No");
		} else {
			pw.println("Yes");
			for(int i=0; i<N; i++) {
				pw.println(ABC.charAt(ans[i]));
			}
		}
		
		sc.close();
		pw.close();
	}

}
