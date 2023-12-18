import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    if(a == b && a == c){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}