import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); 
    int y = scanner.nextInt();
    int a[] = new int[x];
    int sum = 0;
    int i = 0;
    while(i<x-1){
      a[i] = scanner.nextInt();
      sum += a[i];
      i++;
    }
    Arrays.sort(a);
    double aa = (double)a[x-y] / sum;
    double bb = (double)1/ (4*y);
    
    if(aa >= bb){
      System.out.print("Yes");
    }
    else{
      System.out.print("No");  
    }
  }
}