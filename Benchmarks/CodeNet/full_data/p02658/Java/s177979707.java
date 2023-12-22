import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long h = (long)Math.pow(10,18);
		int flag =0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
			if(arr[i]==0){
				flag = 1;
			}
		}
		if(flag==0){
		long ans =1;
		for(int i=0;i<n;i++){
			ans=ans*arr[i];
			if(ans>h){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans);
		}
		else{
			System.out.println(0);
		}
	}
}