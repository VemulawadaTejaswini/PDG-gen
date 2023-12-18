import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int n, k;
	int[] a;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int ans = n;
		
		for(int i=n-1;i>=0;i--){
			if(i<n-1 && a[i]==a[i+1]){
				continue;
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(a[i]);
			long min = k+a[i];
			for(int j=0;j<n;j++){
				if(i!=j){
					ArrayList<Integer> list2 = new ArrayList<Integer>();
					for(int x : list){
						if(x<k && !list.contains(x+a[j])){
							list2.add(x+a[j]);
						}
					}
					list.addAll(list2);
					if(a[i]+a[j]>k) break;
				}
			}
			for(int x : list){
				if(x > k){
					min = Math.min(min, x);
				}
			}
			//System.err.println(i + " " + min);
			if(min >= k+a[i]){
				ans = i+1;
				break;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}
