import java.util.*;
import java.io.*;
public class A{
  public static void main(String... args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    int tmpa,tmpb;
    while(true){

      tmpa = moveA(a, b);
      if(a == tmpa){
        System.out.println("Borys");
        return;
      }
      a = tmpa;
      tmpb = moveB(a, b, n);
      if(b == tmpb){
        System.out.println("Alice");
        return;
      }
      b = tmpb;
    }

  }

  public static int moveA(int a, int b){
    int tmp = a;
    if(b-a == 1){
      if(a > 1)
        tmp -= 1;
    }else{
      tmp += 1;
    }

    return tmp;
  }

  public static int moveB(int a, int b, int n){
    int tmp = b;
    if(b-a == 1){
      if(b < n)
        tmp += 1;
    }else{
      tmp -= 1;
    }

    return tmp;
  }
}
