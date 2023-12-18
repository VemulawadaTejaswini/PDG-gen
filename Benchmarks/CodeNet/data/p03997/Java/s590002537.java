import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int a = new Scanner(System.in).nextInt();
    int b = new Scanner(System.in).nextInt();
    int h = new Scanner(System.in).nextInt();
    int area;
    area = (a+b)/2*h;

    System.out.println(area);
  }
}
