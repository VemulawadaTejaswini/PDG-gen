import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = null;
    if(a < b) {
      s = a;
      for(int i= 1; i<b;i++){
        s += a;
      }
    }
    else {
      s = b;
      for(int i= 1; i<a;i++){
        s += b;
      }
    }
    System.out.println(s);
  }
}
