import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int[] arr_n = new int[n];
		int[] arr_m = new int[m];
		for(int i = 0;i<n;i++){
			arr_n[i] = in.nextInt();
			}
		for(int j=0;j<m;j++){
			arr_m[j] = in.nextInt();
			}
		
		int i=0,j=0;

		int ans=0;
		for(;i<n&&j<m;){
		if(arr_n[i]<arr_m[j]){
			if(k<arr_n[i]){
				break;}
		
			k -= arr_n[i];ans++;i++;
			}
		else{
			if(k<arr_m[j]){
				break;
			}
			k-=arr_m[j];ans++;j++;
		}
		}
		

		for(;i<n;i++){
			if(k<arr_n[i]){
				break;
				}
			k-=arr_n[i];ans++;
			}
		for(;j<m;j++){
			if(k<arr_m[j]){
				break;
			}
			k-=arr_m[j];ans++;
			}

	System.out.println(ans);

	}
}
			








			






			
		