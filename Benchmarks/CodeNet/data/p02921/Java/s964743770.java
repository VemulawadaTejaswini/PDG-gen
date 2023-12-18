import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int x = b / a;
    int y = b % a;
    int num;
    if(a > b) num = 0;
    else if(y == 0) num = x;
    else num = x + 1;
    System.out.println(num);
  }
}