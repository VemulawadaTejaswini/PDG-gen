import java.util.Collections;
import java.io.*;
import java.util.*;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long arr[] = new long[n];
    long sum = 0;
    for(long i=0;i<n;i++)
      arr[i] = sc.nextLong();
    Arrays.sort(arr,Collections.reverseOrder());
    for(long i=k;i<n;i++){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
