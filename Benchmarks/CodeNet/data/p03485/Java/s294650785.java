import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
   
    c = (a + b) % 2;
    if (c == 0){
      System.out.println((a + b)/2);
    }else{
      System.out.println((a + b)/2 - 0.5);
    }
  }
}