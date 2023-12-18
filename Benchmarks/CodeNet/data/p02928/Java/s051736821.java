import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n = sc.nextInt();
    long k = sc.nextLong();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    long ten=0;
    long jun=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]>a[j]){
          ten++;
        }else if(a[i]<a[j]){
          jun++;
        }
      }
    }
    
    System.out.println( ((ten*calc(k)+jun*calc(k-1)))%1000000007 );
  }
  static long calc(long p){
    return ((p+1)*p/2)%1000000007;
  }
}