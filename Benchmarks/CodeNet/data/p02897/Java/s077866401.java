import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float p = 0f;
    if(n%2 == 0){
      p = 0.5f;
      System.out.println(p);
    }else{
      p =(float)(n/2 + 1) / n;
        System.out.println(p);
    }

  }
}
