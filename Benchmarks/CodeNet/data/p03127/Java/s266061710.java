import java.util.*;

class Main3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 1000000001;
		for(int i = 1; i < n; i++){
			int wa1 = a[i];
			int wa2 = a[i+1];
			int work;
			while(true){
				if(wa1 > wa2){
					work = wa1;
					wa1 = wa2;
					wa2 = work;
				}
				if(wa2%wa1==0){
					break;
				}
				int hw = wa2/wa1;
				wa2 = wa2 - wa1*hw;
			}
			ans = Math.min(ans,wa1);
		}
		System.out.print(ans);
 	}
}
