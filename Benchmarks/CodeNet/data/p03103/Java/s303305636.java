import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
      Scanner sc=new Scanner(System.in);
      String[] param = sc.nextLine().split(" ");
      Integer N = Integer.parseInt(param[0]);
      Integer M = Integer.parseInt(param[1]);
      
      List<Integer> A = new ArrayList<>();
      List<Integer> B = new ArrayList<>();
      for(int index=0; index<N; index++) {
        String[] shop = sc.nextLine().split(" ");
        A.add(Integer.parseInt(shop[0]));
        B.add(Integer.parseInt(shop[1]));
      }

      long money = 0;
      Integer buy = 0;
      while( buy < M ) {
        // 最小の金額のものを探す
        int minimum_price = 1100000000;
        int minimum_shop  = -1;
        
        for(int index=0; index<N; index++) {
          if(A.get(index) < minimum_price) {
            minimum_price = A.get(index);
            minimum_shop  = index;
          }
        }
        
        // 全部買っても足りない？
        if(buy + B.get(minimum_shop) < M) {
          //System.out.println("get " + B.get(minimum_shop) + " drink at " + minimum_shop);
          buy += B.get(minimum_shop);
          money += (long)B.get(minimum_shop) * (long)A.get(minimum_shop);
          B.set(minimum_shop, 0);
          A.set(minimum_shop, 1200000000);
        } else {
          int cart = M - buy;
          //System.out.println("get " + cart + " drink at " + minimum_shop);
          buy += cart;
          money += (long)cart * (long)A.get(minimum_shop);
          // もう店の在庫気にしない
        }
      }

      System.out.println(money);
    }
}
