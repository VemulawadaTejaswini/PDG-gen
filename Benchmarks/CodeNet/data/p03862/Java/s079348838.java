import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long x=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    sc.close();
    long counter=0;
    for(int i=0;i<n-1;i++){
      if(a[i]+a[i+1]>x){
        counter+=(a[i]+a[i+1]-x);
        if(a[i]<=x){
          a[i+1]=x-a[i];
        }else{
          counter+=a[i]-x;
          a[i]=x;
          a[i+1]=0;
        }
      }
    }
    System.out.println(counter);
  }
}