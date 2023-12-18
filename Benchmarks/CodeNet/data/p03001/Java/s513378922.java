import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int w = sc.nextInt();
        int h = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int res =(x==w/2 && y==h/2)?1:0;
  
        System.out.println(w*h/2+" "+res);
    }

}


