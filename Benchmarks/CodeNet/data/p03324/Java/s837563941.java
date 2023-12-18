import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = 1;
    for (int i=0;i<s.nextInt();i++){a *= 100;}
    System.out.println(a * s.nextInt());
  }
}
  