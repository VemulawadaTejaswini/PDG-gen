import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int s;

    if((a + b) % 2 == 0){
      s = (a + b)/2;
      System.out.println(s);
    }else{
      System.out.println("IMPOSSIBLE");
    }

    }

  }
