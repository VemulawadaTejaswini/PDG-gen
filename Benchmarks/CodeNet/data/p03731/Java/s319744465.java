import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n=sc.nextInt();
    int t=sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    long sum=0;
    int end=0;
    for(int i=0;i<n;i++){
      sum+=Math.min(a[i]+t-end,t);
      end=a[i]+t;
    }
    System.out.println(sum);
  }
}