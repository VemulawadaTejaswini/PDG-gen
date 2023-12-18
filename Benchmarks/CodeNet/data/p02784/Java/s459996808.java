import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
      h = h-arr[i];
    }
    if(h<=0) System.out.println("Yes");
    else System.out.println("No");
  }
}
    
      
      