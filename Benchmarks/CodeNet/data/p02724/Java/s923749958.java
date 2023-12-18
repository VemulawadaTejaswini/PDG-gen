import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int X = scanner.nextInt();
    
    int a = X / 500;
    X = X - a * 500;
    int b = X / 5;
    
    int answer = a * 1000 + b * 5;
    System.out.println(answer);
  }
}