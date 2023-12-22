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
		int ans = arr[arr.length-1];
        n=n-2;
		for(int i=arr.length-2;i>=0;i--){
			if(n<=0){
				break;
			}
			ans=ans+arr[i];
			n=n-1;
			if(n<=0){
				break;
			}
			ans=ans+arr[i];
			n=n-1;
		}
		System.out.println(ans);
		//System.out.println(ans-arr[idx]);
	}
}