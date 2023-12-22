import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i=0; i<n; i++){
			s[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		int[] q = new int[p];
		for(int i=0; i<p; i++){
			q[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i=0; i<p; i++){
			int upp = n-1;
			int low = 0;
			int mid = (upp+low)/2;
			while(low<upp){
				if(s[mid]==q[i]){
					ans++;
					break;
				}
				else if(s[mid]>q[i]){
					upp = mid;
					mid = (upp+low)/2;
				}
				else{
					low = mid;
					mid = (upp+low)/2;
				}
				if(upp-low==1 && s[upp]!=q[i] && s[low]!=q[i]){
					break;
				}
			}
		}
		System.out.println(ans);
	}
}	

