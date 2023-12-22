import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    long m = 1;
    for (int i=1; i<=a; i++){
      long tmp=sc.nextLong();
      m*=tmp;
    }
    if (m>1000000000000000000L){
      System.out.println(-1);
      System.exit(0);
    }
    System.out.println(m);
  }
}