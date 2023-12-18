import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c;
    for(int i = a; i <= b; i++){
      if(i % k == 0){
        System.out.println("OK");
        break;
      }
      c = i;
    }
    if(c == b)
      System.out.println("NG");
  }
}
    
    
