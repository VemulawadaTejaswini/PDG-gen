import java.util.*;

public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());

      double x = (double)a/c;
      double y = (double)c/b;

      if(x>=y){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
