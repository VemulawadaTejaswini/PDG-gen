import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int a[] = new int[n];		
		String pos = "POSSIBLE ", imp = "IMPOSSIBLE ";
		
		for(int i=0;i<n;i++)a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		
		int min = a[0], max = a[n-1];
		//maxを因数分解
		List<Integer> ls = new ArrayList<>();
		for(int i=2;i*i<=max;i++) {
			if(max%i==0) {
				ls.add(i);
				if(i*i!=max) {
					ls.add(max/i);
				}
			}
		}
		Collections.sort(ls);
		
		int div = 1;
		for(int i=0;i<ls.size();i++) {
			int now = ls.get(i);
			boolean ok = true;
			for(int j=0;j<n;j++) {
				if(a[j]%now==0)continue;
				ok = false;
				break;
			}
			if(ok)div = now;
		}
		
		if(k>max) {
			System.out.println(imp);
			return;
		}
		if(n==1) {
			if(min == k)System.out.println(pos);
			else System.out.println(imp);
			return;
		}
		
		if(div==1) {
			System.out.println(pos);
			return;
		}
		
		if(k%div==0)System.out.println(pos);
		else System.out.println(imp);

	}
}
