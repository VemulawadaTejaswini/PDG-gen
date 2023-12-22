import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  long []po=new long[n];
  long sum=0;
  long a[]=new long[n];
  for(int i=0;i<n;i++){
  	po[i]=sc.nextLong();
    a[i]=(i==0)?po[0]:a[i-1]+po[i];
    sum+=po[i];
  }
  long ans=0;
  for(int i=0;i<n;i++){
  	ans+=po[i]*sum-po[i];
    ans%=1000000007;
  }System.out.println(ans);
  
}
}