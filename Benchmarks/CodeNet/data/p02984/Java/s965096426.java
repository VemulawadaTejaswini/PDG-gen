import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    long sum=0;
    for(int i=0;i<n;i++){
      sum+=a[i];
    }
    for(int i=1;i<n;i+=2){
      sum-=2*a[i];
    }
    b[0]=(int)sum;
    for(int i=1;i<n;i++){
      b[i]=2*a[i-1]-b[i-1];
    }
    for(int i=0;i<n;i++){
      System.out.println(b[i]);
    }
  }
}