import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int t =1;
		 long mod = (long)(Math.pow(10, 9)+(long)7);
		while(t-->0){
			int n=scn.nextInt();
			long []arr =new long[n];
			long sum=0l;
		  for(int i=0;i<arr.length;i++){
			  arr[i]=scn.nextLong();
			  sum+=arr[i];
              sum%=mod;
			  
		  }
		  long ans=0l;
		   for(int i=0;i<n;i++){
			   sum-=arr[i];
			   ans+=(((arr[i]%mod)*(sum%mod)))%mod;
			   ans%=mod;
		   }
		 
		   System.out.println(ans);
		}

	}

}

