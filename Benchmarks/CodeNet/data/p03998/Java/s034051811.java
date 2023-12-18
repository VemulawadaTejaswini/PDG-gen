import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<String> sa = new ArrayList<>();
    for(String s: scanner.next().split("")) {
      sa.add(s);
    }
    ArrayList<String> sb = new ArrayList<>();
    for(String s: scanner.next().split("")) {
      sb.add(s);
    }
    ArrayList<String> sc = new ArrayList<>();
    for(String s: scanner.next().split("")) {
      sc.add(s);
    }
    
    // 手番プレイヤーをAに決める
    // 繰り返し
    //  手番プレイヤーの配列0番目を見て、"a"なら次の人はAのように次の人を決める
    //  手番プレイヤーの配列0番目を捨てる
    //  手番プレイヤーの配列が長さ0なら手番プレイヤーの勝利で終わり
    String player = "a";
    while(true) {
      if(player.equals("a")) {
        if(sa.size() == 0) {
          System.out.println("A");
          break;
        }
        player = sa.get(0);
        sa.remove(0);
      } else if(player.equals("b")) {
        if(sb.size() == 0) {
          System.out.println("B");
          break;
        }
        player = sb.get(0);
        sb.remove(0);
      } else {
        if(sc.size() == 0) {
          System.out.println("C");
          break;
        }
        player = sc.get(0);
        sc.remove(0);
      }
    }
  }
}