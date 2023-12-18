import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i <= n;i++){
      arr[i] = sc.nextInt();
    }
    
    Arrays.sort(arr);
    
    int i,x = 0;
    for(i = 0;i < n;i++){
      x += arr[i];
    }
    if(arr[n]>x){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
    
  }
  
}
      