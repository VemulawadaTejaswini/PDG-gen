import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      Long A = Long.parseLong(sc.next());
      Long B = Long.parseLong(sc.next());
      Long C = Long.parseLong(sc.next());
      Long K = Long.parseLong(sc.next());

      long total = 0;

        for(int i=0;i<A;i++){
            total ++;
            K--;
            if(K <= 0)break;
        }
        if(K >= 1){
            for(int i=0;i<B;i++){
                K--;
                if(K <= 0) break;
            }
        }
        if(K >= 1){
            for(int i=0;i<C;i++){
                total --;
                K--;
                if(K <= 0) break;
            }
        }
        System.out.println(total);
    }
    
}
