import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner();
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(b<=a)System.out.printf("delicious");
    else if(b<=a+x)System.out.println("safe");
    else System.out.println("dangerous");
  }
}
