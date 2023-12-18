import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt(); //県の数
    int M = sc.nextInt(); //市の数

    ArrayList<Integer[]>[] prefectures = new ArrayList[N]; //[0] 市の番号 [1] 年
    for (int i=0; i<N; i++) {
      prefectures[i] = new ArrayList();
    }

    for (int i=0; i<M; i++) {
      int p = sc.nextInt()-1;
      int y = sc.nextInt();
      for (int j=0; j<=prefectures[p].size(); j++) {
        if (j == prefectures[p].size() || prefectures[p].get(j)[1] > y) {
          prefectures[p].add(j, new Integer[]{i, y});
          break;
        }
      }
    }

    String[] ids = new String[M];
    for (int i=0; i<N; i++) {
      for (int j=0; j<prefectures[i].size(); j++) {
        Integer[] city = prefectures[i].get(j);
        ids[city[0]] = padding0(i+1, 6) + padding0(j+1, 6);
      }
    }

    for (int i=0; i<M; i++) {
      System.out.println(ids[i]);
    }

  }

  static String padding0(int n, int m) {
    String s = Integer.toString(n);
    while(m - s.length() > 0) s = "0" + s;
    return s;
  }

}