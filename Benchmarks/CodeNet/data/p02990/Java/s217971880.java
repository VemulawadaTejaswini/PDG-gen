import java.util.*;
public class Main {
 static int i;//i:蓝球连续排列的个数(s:红球连续排列的个数）
 static long res=0;
 static long M=1000000007;
 public static void main(String []args) {
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   balls(n,k);
 }
 //排序方法一共有n!/(k!*(n-k)!)
 
 public static long balls(int n,int k) {
   for(i=1;i<=k;i++) {
   if(n==2*k) {
    if(i==1|| (i-1)==k || i==k) {
        res=n-k+1;
        System.out.println(res%M);
       }
    else {
        res=2*comb(k-1,i-1)*comb(n-k-1,i-1)+comb(k-1,i-1)*comb(n-k-1,i)+comb(k-1,i-1)*comb(n-k-1,i-2);
        System.out.println(res%M);
       }    
   }
   if(n>2*k) {
    if(i==1|| (i-1)==k) {
        res=n-k+1;
        System.out.println(res%M);
       }
    else {
        res=2*comb(k-1,i-1)*comb(n-k-1,i-1)+comb(k-1,i-1)*comb(n-k-1,i)+comb(k-1,i-1)*comb(n-k-1,i-2);
        System.out.println(res%M);
       }
   }
   if(n<2*k) {
    if(i==1) {
        res=n-k+1;
     System.out.println(res%M);
    }
    else if(i!=k){
        res=2*comb(k-1,i-1)*comb(n-k-1,i-1)+comb(k-1,i-1)*comb(n-k-1,i);
        System.out.println(res%M);
     }
    else {
     res=comb(k-1,i-1)*comb(n-k-1,i);
     System.out.println(res%M);
    }
       }
   }
   return res;
 }
//i==s:排列方式有2*comb(k-1,i-1)*comb(n-k-1,i-1)
//i==s-1ori==s+1:排列方式有comb(k-1,i-1)*comb(n-k-1,i-1)
 
 
/*
 * 11 12 11
 * 22 21 22 22 22 21
 * 32
 */

 public static long comb(int n,int k) {
  int i,j;
  if(n>=2*k) {
   i=n-k+1;
   j=k;
  }
  else {
   i=k+1;
   j=n-k;
  }
  return (pf(i,n)/pf(1,j))%M;
 }
 
 static long pf(int m,int n) {
  long i,f;
  f=1;
  for(i=m;i<=n;i++) {
   f=(f*i)%M;
  }
  return f;
 }
}
