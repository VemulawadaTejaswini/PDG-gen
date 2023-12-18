import java.util.*;
public class Main{
  	public static int gcd(int a,int b){
      return b==0?a:gcd(b,a%b);
    }
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        ar[0]=sc.nextInt();
        int ans=ar[0];
        for(int i=1;i<n;i++){
          ar[i]=sc.nextInt();
          ans=gcd(ans,ar[i]);
        }
      System.out.println(ans);
    }
}