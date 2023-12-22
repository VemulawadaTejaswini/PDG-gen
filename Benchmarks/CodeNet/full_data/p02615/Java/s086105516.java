import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(n==1){
			System.out.println(0);
			return;
		}
		Arrays.sort(arr);
		long ans = arr[arr.length-1];
        int ct=1;
		for(int i=arr.length-2;i>=0;i--){
			if(ct>=(n-1)){
				break;
			}
			ans=ans+arr[i];
			ct++;
			if(ct>=n-1){
				break;
			}
			ans=ans+arr[i];
			ct++;
		}
		System.out.println(ans);
		//System.out.println(ans-arr[idx]);
	}
}