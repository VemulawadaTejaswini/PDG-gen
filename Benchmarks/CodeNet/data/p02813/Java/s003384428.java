import java.util.*;

public class Main {
	public static long fact(int n){
		if(n == 1 || n == 0)return 1;
		return n * fact(n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		int q[] = new int[n];
		List<Integer> listp = new ArrayList<Integer>();
		List<Integer> listq = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i){
			p[i] = sc.nextInt();
			listp.add(i + 1);
		}
		for (int i = 0; i < n; ++i){
			q[i] = sc.nextInt();
			listq.add(i + 1);
		}
		sc.close();
		long ans = 0;
		long fact = fact(n);
		long nump = 1, numq = 1;
		for(int i = 0; i < n - 1; ++i){
			fact /= (n - i);
			int tmp = listp.indexOf(p[i]);
			listp.remove(tmp);
			long tmp2 = fact * (tmp + 1);
			nump += tmp2;
			tmp = listq.indexOf(q[i]);
			listq.remove(tmp);
			tmp2 = fact * (tmp + 1);
			numq += tmp2;
		}
		long num = nump - numq;
		ans = Math.abs(num);
		System.out.println(ans);
	}
}
