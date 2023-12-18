import java.util.*;
import java.util.Arrays;

public class Main{
	
	static void quick_sort(int[] d,int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int [] ans = new int[n];
		for(int i=0;i<n;i++){
			ans[i] = (int)(Math.floor(a*i/b)-a*(Math.floor(i/b)));
		
		}
		quick_sort(ans,0,n-1); 

		System.out.println(ans[n-1]);
		

		
		
	}
}









