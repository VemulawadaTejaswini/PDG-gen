import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0;i < n;i++)a[i]=sc.nextLong();
    long b1 = 0;
    for(int i = 0;i < n;i++)b1+=(long)Math.pow(-1,i+2)*a[i];
    b1/=2;
    System.out.print(b1*2);
    long before = b1;
    long after = b1;
    for(int i = 0;i < n-1;i++){
      before = after;
      System.out.print(" "+((a[i]-before)*2));
      after = a[i]-before;
    }
    System.out.println("");
  }
}