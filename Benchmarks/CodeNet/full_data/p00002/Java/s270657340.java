import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println((int)Integer.toString(a+b).length());
    }
  }
}