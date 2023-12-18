import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int aa = a % 2;
    int bb = b % 2;
    if(aa == 1 && bb == 1){
      System.out.println("Odd");
    }else{
      System.out.println("Even");

    }

  }
}
