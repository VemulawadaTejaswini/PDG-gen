import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long arr [] = new long[n];
    for(long i=0 ; i<n ; i++)
    {
      arr[i] = sc.nextLong();
    }
    long mult = 1;
    for(long i=0 ; i<n ; i++)
    {
      mult = mult * a[i];
    }
    long num = 1000000000000000000;
    if(mult > num)
    {
      System.out.println(-1);
    }
    else{
      System.out.println(mult);
    }
  }
}