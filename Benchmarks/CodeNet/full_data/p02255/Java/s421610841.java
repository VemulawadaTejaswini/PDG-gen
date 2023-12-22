import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int[] A = new int[n];
     for(int i=0;i<n;i++){
       A[i] = scanner.nextInt();
     }
     insertionSort(A,n);


  }

  static int[] insertionSort(int[] A,int n){
    for(int i=1;i<n;i++){
      int v = A[i];
      int j = i - 1;
      while(j>=0 && A[j]>v){
        A[j+1] = A[j];
        j--;
      }
      A[j+1] = v;
      printA(A,n);
    }
    return A;
  }

  static void printA(int[] A,int n){
    for(int i=0;i<n;i++){
      System.out.print(A[i]);
      if(i==n-1){
        System.out.println();
      }else{
        System.out.print(" ");
      }
    }
  }
}

