import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = sc.nextInt();
	}
	int[] b = new int [100000];
	int ans = 1;
	for(int i=0; i<n; i++) {
		b[a[i]]++;
	}
	for(int i=1; i<n-1; i++) {
		if(b[i-1]+b[i]+b[i+1]>ans) {
			ans = b[i-1]+b[i]+b[i+1];
		}		
	}
	System.out.println(ans);
}
}
