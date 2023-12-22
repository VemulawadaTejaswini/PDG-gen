import java.util.Scanner;

public class Main{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int area = area(a, b);
  int length = length(a, b);

  System.out.println(area + " " + length);
}

public static int area(int a, int b){
  return a * b;
}

public static int length(int a, int b){
  return (a + b) * 2;
}
}