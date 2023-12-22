import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long h = (long)Math.pow(10,18);
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLong();
		}
		long ans =1;
		for(int i=0;i<n;i++){
			ans=ans*arr[i];
			//System.out.println(ans);
			
		}
		if(ans>h || ans<0){
				System.out.println(-1);
				return;
		}
		System.out.println(ans);
	}
}