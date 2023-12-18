import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>max){
				max =arr[i];
			}
		}
		int[] arr1 = new int[n+max+1];
		int ans =0;
		for(int i=0;i<n;i++){
			if(i-arr[i]>=0){
				ans+=arr1[i-arr[i]];
			}
			arr1[i+arr[i]]++;
		}
		System.out.println(ans);
	}
}