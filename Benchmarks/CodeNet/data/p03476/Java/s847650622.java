import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  int n=Integer.parseInt(s);

  int l[]=new int[n+10];
  int r[]=new int[n+10];
  int mx=0; 

  for(int i=0;i<n;i++){
   s=scan.next();
   l[i]=Integer.parseInt(s);
   s=scan.next();
   r[i]=Integer.parseInt(s);
   if(mx<r[i])mx=r[i];
  }

  boolean f1,f2;
  long a[]=new long[mx+10];
  for(int i=0;i<mx+1;i++){
   f1=prime(i);
   f2=prime((i+1)/2);
   if(i>0)a[i]=a[i-1];
   if(f1&&f2&&i%2==1)a[i]++;
  }

  for(int i=0;i<n;i++)System.out.println(a[r[i]]-a[l[i]-1]);
 }
 public static boolean prime(long a){
  if(a<=1)return false;
  for(int i=2;i*i<=a;i++){
   if(a%i==0)return false;
  }
  return true;
 }
}

