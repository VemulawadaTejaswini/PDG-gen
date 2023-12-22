import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long[] a =  new long[n];
      	for(int i=0;i<n;i++){
      		a[i]=sc.nextLong();
      	}
      long ans=0;
      for(int i=0;i<n;i++){
      	for(int j=i+1;j<n;j++){
          ans=ans+a[i]*a[j];
          if(ans>1000000007){ans=ans%1000000007;}
        }	
      }
      System.out.println(""+ans);
	}
}