import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a % k == 0 || b % k == 0){
      System.out.println("OK");
      return;
    }

      int rem = a % k;
      int temp = a-rem;
      temp += k;
      for(int i=temp; i<b; i+=k){
        if(temp > a){
          System.out.println("OK");
          return;
        }
      }
      System.out.println("NG");
  }
}
