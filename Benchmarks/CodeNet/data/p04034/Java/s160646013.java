import java.io.*;
import java.util.*;
public class Main {
  static int r_box[];
  static int w_box[];
  static int nn = 0;
  static List<String> rw_List;
  public static void main(String[] args) throws Exception {
    String line = null;
    rw_List = new ArrayList<String>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //1行目のデータの読み込み
    line = br.readLine();
    String input[] = line.split(" ");
    nn = Integer.parseInt(input[0]); // 箱の数
    int mm = Integer.parseInt(input[1]); // 移動データの数
    //System.out.println("箱の数:" + nn + ",操作の数:" + mm);
    r_box = new int[nn];
    w_box = new int[nn];

    //2行目以降(移動データ)の読み込み
    int[][] moveData = new int[mm][2];
    for (int i = 0; i < mm; i++) {
      line = br.readLine();
      input = line.split(" ");
      int xx = Integer.parseInt(input[0]); // 移動前
      int yy = Integer.parseInt(input[1]); // 移動後
      moveData[i][0] = xx;
      moveData[i][1] = yy;
    }

    // すべての組み合わせをリスト
    int[][] intArray = new int[mm][2];
    for (int i = 0; i < mm; i++) {
      for (int j = 0; j < 2; j++) {
        intArray[i][j] = j;
      }
    }
    getAllPattern(0, intArray, "");
    //for (String data : rw_List) {
    //    System.out.println(data);
    //}

    Set<Integer> r_pos = new HashSet<Integer>();
    loop1 : for (String rw_Data : rw_List) {
      // 箱の初期化
      initBox();
      //System.out.println("START: -- " + rw_Data + "-----");
      String val[] = rw_Data.split(",");
      // 赤玉または白玉の移動
      int moved = 0;
      //printBox(); // 移動前の位置
      for (int i = 0; i < mm; i++) {
        int xx = moveData[i][0]; // 移動前
        int yy = moveData[i][1]; // 移動後
        int rr = Integer.parseInt(val[i]);
        if (rr == 1) {
          if (r_box[(xx -1)] == 0) {
            //System.out.println("赤玉がない");
            continue loop1;
          } else {
            r_move(xx, yy);
            moved = yy;
            //System.out.println("赤玉を移動:" + xx + " --> " + yy);
          }
        } else {
          if (w_box[(xx -1)] == 0) {
            //System.out.println("白玉がない");
            continue loop1;
          } else {
            w_move(xx, yy);
            //System.out.println("白玉を移動:" + xx + " --> " + yy);
          }
        }
        //printBox(); // 移動前の位置
      }
      r_pos.add(moved);
      //System.out.println("最後の位置:" + moved);
    }
    //System.out.println("ANSWER=" + r_pos.size());
    System.out.println(r_pos.size());
  }

  // それぞれの玉の位置の初期化
  public static void initBox() {
    for (int i = 0; i < nn; i++) {
      if (i == 0) {
        r_box[i] = 1;
        w_box[i] = 0;
      } else {
        r_box[i] = 0;
        w_box[i] = 1;
      }
    }
  }

  // 赤玉と白玉の位置を出力
  public static void printBox() {
    for (int i = 0; i < nn; i++) {
      System.out.println((i + 1) + ":R=" + r_box[i] + ",W=" + w_box[i]);
    }
  }

  // 赤玉を移動
  public static void r_move(int a, int b) {
    r_box[(a - 1)] = r_box[(a - 1)] - 1;
    r_box[(b - 1)] = r_box[(b - 1)] + 1;
  }

  // 白玉を移動
  public static void w_move(int a, int b) {
    w_box[(a - 1)] = w_box[(a - 1)] - 1;
    w_box[(b - 1)] = w_box[(b - 1)] + 1;
  }

  // 赤/白選択のすべての組み合わせを作成
  static void getAllPattern(int i, int[][] intArray, String output){
    if (i == intArray.length) {
      rw_List.add(output);
      return;
    }
    String del = (output.length() > 0) ? "," : "";
    for (int j = 0; j < intArray[i].length; j++) {
      getAllPattern(i + 1, intArray, output + del + intArray[i][j]);
    }
  }

}