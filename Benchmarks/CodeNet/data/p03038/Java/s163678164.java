import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<>();

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();

		Arrays.sort(a);

		for(int i=0;i<m;i++){
			int v = sc.nextInt();
			int w = sc.nextInt();
			for(int j=0;j<v;j++)b.add(w);
		}

		Collections.sort(b, Collections.reverseOrder());

		long ans = 0;
		int cnt = 0;

		int acnt = n-1;
		int bvalue = 0;
		Iterator it = b.iterator();

		while(cnt<n&&it.hasNext()){
			bvalue = (int)(it.next());
			boolean flg = true;
			while(flg&&cnt<n){
				if(bvalue>a[acnt]){
					ans += bvalue;
					flg = false;
					cnt++;
				} else {
					ans += a[acnt];
					acnt--;
					cnt++;
				}
			}
		}
		while(cnt<n){
			ans += a[acnt];
			acnt--;
			cnt++;
		}

		// 出力
		System.out.println(ans);
	}
}