import java.io.*;
import java.util.*;


class Main {
  private static int maxBooks(int[] arr1, int[] arr2, int K){
    int i=0;
    int j=0;
    
    int count = 0;
    while(i < arr1.length && j < arr2.length){
      int currentMin = Math.min(arr1[i],arr2[j]);
      if(currentMin <= K){
        count++;
        K-=currentMin;
        
      } else {
        return count;
      }
      if(arr1[i] < arr2[j]){
        i++;
      } else {
        j++;
      }
    }
    
    while(i<arr1.length){
      if(arr1[i] <= K){
        count++;
        K-=arr1[i];
        i++;
      } else {
        return count;
      }
    }
    while(j<arr2.length){
      if(arr2[j] <= K){
        count++;
        K-=arr2[j];
        j++;
      } else {
        return count;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int K = sc.nextInt();
    
    int[] arr1 = new int[N];
    int[] arr2 = new int[M];
    
    for(int i=0;i<N;i++) arr1[i] = sc.nextInt();
    for(int i=0;i<M;i++) arr2[i] = sc.nextInt();
    
    System.out.println(maxBooks(arr1,arr2,K));
  }
}
