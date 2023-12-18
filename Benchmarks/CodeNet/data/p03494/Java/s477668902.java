import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    int cnt = 0;
    int min = 1000000000;

    for(int i = 0; i < n; i++){
      a[i] = scan.nextInt();
      while(a[i] % 2 == 0){
        a[i] /= 2;
        cnt++;
      }
      min = Math.min(min, cnt);
      cnt = 0;
    }

    System.out.println(min);
  }
}
