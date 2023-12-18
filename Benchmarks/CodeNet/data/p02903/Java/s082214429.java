import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int h = Integer.parseInt(sc.next());
      int w = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());

      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if((j<a && i<b) || (j>=a && i>=b)){
            System.out.print("0 ");
          }
          else{
            System.out.print("1 ");
          }
        }
        System.out.println("");
      }

    }
}
