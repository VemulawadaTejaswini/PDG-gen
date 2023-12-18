import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		a[n] = 0;
		Arrays.sort(a);
		int ans = 0;
		for(int i=n; i>0; i--){
			int temp = i;
			while(a[i]==a[temp]){
				temp--;
			}
			if((i-temp)%2==1){
				ans++;
			}
			i = temp + 1;
		}
		System.out.println(ans);
	}
}