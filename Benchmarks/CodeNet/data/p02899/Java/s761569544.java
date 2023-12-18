import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n + 100];
    for (int i = 1; i <= n; i++) {
      a[i]  = sc.nextInt();
    }
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        if(a[j] == i) System.out.print(j + " ");
      }
    }
return;
  }
}
