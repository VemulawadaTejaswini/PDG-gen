import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.arrays;

class Main{
  public static void main(string[] a){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10]; 
    for (int i = 0; i<10; i++)
      arr[i] = integer.parseint(br.readline());

    arrays.sort(arr);
    for (int i = 0; i < 3; i++)
      system.out.println(arr[i]);
  }
}