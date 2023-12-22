import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class main{
  public static void main(string[] a){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10]; 
    for (int i = 0; i<10; i++)
      arr[i] = Integer.parseInt(br.readLine());

    Arrays.sort(arr);
    for (int i = 0; i < 3; i++)
      System.out.println(arr[i]);
  }
}