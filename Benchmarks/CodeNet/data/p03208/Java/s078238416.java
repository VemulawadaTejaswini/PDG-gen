import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Integer[] array = new Integer[n];

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    Arrays.sort(array,Collections.reverseOrder());

    //for(int a:array){System.out.println(a);}
    int max = -1;
    int min = -1;
    int sub_min = Integer.MAX_VALUE;

    for(int i=0; i<n-k+1;i++){
      max = array[i];
      min = array[i+k-1];
      if(sub_min>max-min){
        sub_min = max - min;
      }
    }

    System.out.println(sub_min);

  }
}