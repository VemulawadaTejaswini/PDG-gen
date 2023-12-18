import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int a[] = new int[n];
      	int sum=0;
      	for(int i=0;i<n;i++){
        	a[i] = in.nextInt();
          	sum+=a[i];
        }
      	if(sum%n==0){
        	sum/=n;	
        }
      	else{
          sum = sum/n+1;
        }
      	int ans=0;
    	for(int i=0;i<n;i++){
        	ans+=(a[i]-sum)*(a[i]-sum);
        }  	
   		System.out.println(ans);
    }

}