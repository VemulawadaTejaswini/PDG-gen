import java.util.Collections;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    BigInteger sum = 0;
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    Arrays.sort(arr,Collections.reverseOrder());
    for(int i=k;i<n;i++){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
