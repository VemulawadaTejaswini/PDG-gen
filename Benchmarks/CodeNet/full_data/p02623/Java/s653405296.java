import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0;i < n; ++i){
			a[i] = scan.nextInt();
		}
		for(int i = 0;i < m; ++i){
			b[i] = scan.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Queue<Integer> que_a = new ArrayDeque<>();
		Queue<Integer> que_b = new ArrayDeque<>();
		for(int i = 0;i < n; ++i)que_a.add(a[i]);
		for(int i = 0;i < m;++i)que_b.add(b[i]);
		long time = 0;
		int ans = 0;
		while(!que_a.isEmpty() || !que_b.isEmpty()){
			int a_time = que_a.peek() == null ? Integer.MAX_VALUE:que_a.peek();
			int b_time = que_b.peek() == null ? Integer.MAX_VALUE:que_b.peek();
			if(a_time <= b_time){
				que_a.remove();
				time += a_time;
				if(time > k)break;
				ans++;
			}else{
				que_b.remove();
				time += b_time;
				if(time > k)break;
				ans++;
			}
		}
		System.out.print(ans);

	}
}