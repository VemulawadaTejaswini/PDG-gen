import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int a[]=new int[n];
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
          a[i]=x;
          a[i+1]=0;
        }
      }
    }
    System.out.println(counter);
  }
}