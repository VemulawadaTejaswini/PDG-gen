import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  int n=Integer.parseInt(s);

  int d[]=new int[n+10];
  int mx=0,a; 
  for(int i=0;i<n;i++)d[i]=0;

  for(int i=0;i<n;i++){
   s=scan.next();
   a=Integer.parseInt(s);
   d[a]++;
   if(mx<a)mx=a;
  }
  long ans=1;
  for(int i=1;i<=mx;i++){
   for(int j=0;j<d[i];j++){
    ans*=d[i-1];
    ans=ans%998244353;
   }
  } 
  System.out.println(ans);
 }

 ///////////////////////////////////////////////
 public static boolean prime(long a){
  if(a<=1)return false;
  for(int i=2;i*i<=a;i++){
   if(a%i==0)return false;
  }
  return true;
 }
 public static long llpow(long x,long n){
  long ans=1;
  for(int i=0;i<n;i++)ans*=x;
  return ans;
 }
 public static long max(long a,long b){
  if(a<b)return b;
  else return a;
 }
 public static long min(long a,long b){
  if(a>b)return b;
  else return a;
 }
}

