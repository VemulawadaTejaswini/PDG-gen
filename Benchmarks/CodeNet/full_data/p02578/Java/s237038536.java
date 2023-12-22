import java.util.*;
class Main{

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    long a=0;
    long arr[]=new long[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
     if(arr[i]<arr[i-1]){
       long k=arr[i-1]-arr[i];
       a=a+k;
       arr[i]=arr[i]+k;
     }
    }
    System.out.println(a);
  }}
  
