import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		 
		long []arr =new long[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextLong();
		}
		Arrays.sort(arr);
		long ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					continue;
				}
				for(int k=j+1;k<n;k++){
					if(arr[i]==arr[k] || arr[j]==arr[k]){
						continue;
					}
					 long sum=arr[i]+arr[j];
					 if(sum>arr[k]){
						 ans++;
					 }
				}
			}
		}
		System.out.println(ans);
		

	}

}