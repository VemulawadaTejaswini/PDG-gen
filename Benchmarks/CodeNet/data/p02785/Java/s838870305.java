import java.util.Collections;
import java.io.*;
import java.util.*;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    long sum = 0;
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    for(int i=0;i<n;i++)
      arr[i] = -arr[i];
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
      arr[i] = -arr[i];
    for(int i=k;i<n;i++){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
