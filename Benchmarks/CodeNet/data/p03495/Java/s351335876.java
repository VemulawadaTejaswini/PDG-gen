import java.util.*;

//081C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt()-1;	
		sc.close();
		
		Set<Integer> s = new HashSet<Integer>();
		
		int cnt[] = new int[N];
		
		for(int i=0;i<N;i++) {
			cnt[A[i]]++;
			s.add(A[i]);
		}
		
		int num[] = new int[N];
		for(int i=0;i<N;i++) {
			num[cnt[i]]++;
		}
		
		int change = Math.max(0, s.size() - K) ;
		
		int ans = 0;
		int i=0;
		while(ans<change) {
			if(num[i]==0)i++;
			ans += i;
			num[i]--;
		}
		
		System.out.println(ans);
		
	}
}
