import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long t = sc.nextLong();
    long[] a = new long[n];
    long cnt = 0;
    long min = 1000000001;
    long max = 0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      if(a[i]-min>max){
        max = a[i]-min;
        cnt=1;
      }else if(a[i]-min==max){
        cnt++;
      }
      min = Math.min(a[i],min);
    }
    System.out.println(cnt);
  }
}