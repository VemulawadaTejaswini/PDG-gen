import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      
      int W = sc.nextInt();
      int H = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int r = sc.nextInt();
      
      if(y>=r&&H-r>=y&&x>=r&&W-r>=x){
          System.out.println("Yes");
      }else if(!(y>=r&&H-r>=y&&x>=r&&W-r>=x)){
          System.out.println("No");
      }
    }
}

