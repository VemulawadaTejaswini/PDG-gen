import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    byte a = sc.nextInt();
    byte b = sc.nextInt();
    String u = sc.next();
    
    if(s == u){
      a--;
    }else if(t == u){
      b--;
    }
    System.out.println(a + " " + b);
  }
}
