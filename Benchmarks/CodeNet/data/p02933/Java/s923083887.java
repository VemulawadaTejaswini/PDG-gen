import java.util.*;
class Main {
  public static void main(String[] args) {
    scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    String s = stdin.next();
    if(a >= 3200){
      System.out.println(s);
    }
    else{
      System.out.println("red");
    }
  }
}
