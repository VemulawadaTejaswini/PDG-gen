import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

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
    HashMap<String, ArrayList> smap = new HashMap<>();
    smap.put("a", sa);
    smap.put("b", sb);
    smap.put("c", sc);
    
    // 手番プレイヤーをAに決める
    // 繰り返し
    //  手番プレイヤーの配列0番目を見て、"a"なら次の人はAのように次の人を決める
    //  手番プレイヤーの配列0番目を捨てる
    //  手番プレイヤーの配列が長さ0なら手番プレイヤーの勝利で終わり
    String player = "a";
    while(true) {
      ArrayList<String> splayer = smap.get(player);
      if(splayer.size() == 0) {
        System.out.println(player.toUpperCase());
        break;
      }
      player = splayer.get(0);
      splayer.remove(0);
    }
  }
}
