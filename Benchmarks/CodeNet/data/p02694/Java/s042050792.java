import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    long k = s.nextLong();
    double a = 100;
    int i = 0;
    while(a <= k){
      a = a * 1.01;
      i++;
    }
    System.out.println(i);
  }
    
}