
import java.util.*;
import java.io.*;

public class Main {
	public static boolean composite[] = new boolean[100001];
	public static int total[] = new int[100001];
	public static void soe(int up) {
		int sqrt = (int)Math.sqrt(up);
		composite[1] = true;
		for(int i=2;i<=sqrt;i++) {
			if(!composite[i]) {
				for(int j=i*i;j<=up;j+=i) {
					composite[j] = true;
				}
			}
		}
	}
	
	public static void count(int up) {
		for(int i=3;i<=up;i++) {
			total[i] = total[i-1];
			if(i%2==0) {
				continue;
			}
			if(!composite[i]&&!composite[(i+1)/2]) {
				total[i]++;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		soe(100000);
		count(100000);
		int Q = Integer.parseInt(br.readLine());
		for(int i=1;i<=Q;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			System.out.println(total[r]-total[l-1]);
		}
	}

}
