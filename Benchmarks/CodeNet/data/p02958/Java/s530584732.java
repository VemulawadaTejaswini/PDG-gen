import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer p[] = new Integer[n];
    for(int i=0;i<n;i++){
      p[i] = sc.nextInt();
    }
    int d = 0;

    for(int i=0;i < n-1 ;i++){
      if(p[i] < p[i+1]){
        d ++;
      }
    }
    if(d == 2 || d == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

    }

  }
