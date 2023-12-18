import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String a,b;
    int c;
    boolean d = false;
    Scanner scan = new Scanner(System.in);
    a = scan.next();
    b = scan.next();
    c = Integer.parseInt(a + b);
    for(int i = 0; i <= c; i++){
      if(c == i*i){
        d = true;
        break;
      }
    }
      
    if(d){       
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}