import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ax[] = new int[n];
		int ay[] = new int[n];
		
		int bx[] = new int[n];
		int by[] = new int[n];
		
		for(int i=0;i<n;i++){
			ax[i] = sc.nextInt();
			ay[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			bx[i] = sc.nextInt();
			by[i] = sc.nextInt();
		}
		
		boolean v[] = new boolean[n];
		List<Integer> cnt[] = new ArrayList[n];
		
		for(int i=0;i<n;i++){
			cnt[i] = new ArrayList<>();
			for(int j=0;j<n;j++){
				if(bx[i]>ax[j] && by[i]>ay[j]){
					cnt[i].add(j);
				}
			}
		}
		
		int ans = 0;
		Arrays.sort(cnt, new Comparator<List<Integer>>(){

			@Override
			public int compare(List<Integer> a, List<Integer> b) {
				return a.size()-b.size();
			}
			
		});
		for(int i=0;i<n;i++){
			for(int j:cnt[i]){
				if(!v[j]){
					v[j] = true;
					ans++;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
