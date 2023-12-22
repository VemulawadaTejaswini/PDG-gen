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
		int idx=-1;
        n=n-2
		for(int i=arr.length-2;i>=0;i--){
			ans=ans+2*arr[i];
			n=n-2;
			if(n<=0){
				idx=i;
				break;
			}
		}
		if(n==0){
			System.out.println(ans);
		}
		else{
			System.out.println(ans-arr[idx]);
		}
	}
}