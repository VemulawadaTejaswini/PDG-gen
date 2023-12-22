import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int k = s.nextInt();
    double a = 100;
    int i = 0;
    while(a <= (double)k){
      a = a * 1.01;
      i++;
    }
    System.out.println((int)i);
  }
    
}