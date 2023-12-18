import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Integer[] a = new Integer[n];
    int AliceSum = 0;
    int BobSum = 0;

    for(int i = 0; i < n; i++){a[i] = scan.nextInt();}
    Arrays.sort(a, Collections.reverseOrder());

    if(n % 2 == 0){
      for(int i = 0; i < n/2; i++)
        AliceSum += a[i];
      for(int i = n/2; i < n; i++)
        BobSum += a[i];
    }else{
      for(int i = 0; i < (n/2 + 1); i++)
        AliceSum += a[i];
      for(int i = (n/2 + 1); i < n; i++){
        BobSum += a[i];
      }
    }

    System.out.println(AliceSum-BobSum);
  }
}
