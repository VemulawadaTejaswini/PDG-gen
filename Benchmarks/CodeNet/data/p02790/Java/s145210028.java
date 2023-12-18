import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.next();
    int b = sc.next();
    String s;
    if(a < b) {
      for(int i= 0; i<b;i++){
        s += a;
      }
    }
    else {
      for(int i= 0; i<a;i++){
        s += b;
      }
    }
    System.out.println(s);
  }
}
