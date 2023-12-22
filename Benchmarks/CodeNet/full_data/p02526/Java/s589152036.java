import java.util.*;

/* AOJ10031 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[100001];
		Arrays.fill(check,false);
		int n, q, cnt=0;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			check[sc.nextInt()]=true;
		}
		q=sc.nextInt();
		for(int i=0;i<q;i++) {
			if(check[sc.nextInt()]) cnt++;
		}
		System.out.println(cnt);
	}
}