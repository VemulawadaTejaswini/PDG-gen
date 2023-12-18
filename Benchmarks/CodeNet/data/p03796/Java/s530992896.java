import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=1000000007;
    long n=sc.nextInt();
    long power=1;
    
    for(int i=1;i<=n;i++) {
      power=(power*i) % m;
    }
    System.out.println(power);
  }
}
