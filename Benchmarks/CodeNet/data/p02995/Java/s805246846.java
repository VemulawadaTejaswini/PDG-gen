import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong() - 1;
    long b = sc.nextLong();
    int c = sc.nextInt();
    int d = sc.nextInt();
    long na = a - a / c - a / d + a / ((long)c * d);
    long nb = b - b / c - b / d + b / ((long)c * d);
    System.out.println(nb - na);
  }
}


