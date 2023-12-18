import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int xtt = sc.nextInt();
        for(int i=1; i<11;i++) {
          if(i!=1){System.out.print("\n");}
            xtt = (r*xtt)-D;
            // 出力
            System.out.print(xtt);
        }
    }
}