import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    String s = "YES";
    while(a-d>0 || c-b>0){
        c=c-b;
        
        if(a-d <= 0){
            s = "NO";
            break;
        }
        a = a-d;
    }
      System.out.println(s);
  }
}