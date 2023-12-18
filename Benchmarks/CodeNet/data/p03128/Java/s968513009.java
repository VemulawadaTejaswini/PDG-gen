
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int mod = 1000000007;
  static int[] matchNum = {2, 5, 5, 4, 5, 6, 3, 7, 6};

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int total = cin.nextInt();
    int m = cin.nextInt();

    List<numMatch> usedMatchNum = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      int num = cin.nextInt();
      usedMatchNum.add(new numMatch(num, matchNum[num - 1]));
    }

    Collections.sort(usedMatchNum);

    List<Integer> res = new ArrayList<>();

    buildRes(usedMatchNum, total, res);

//    for (int a : res) {
//      System.out.println(a);
//    }
    Collections.sort(res);
    StringBuilder sb = new StringBuilder();
    for (int i: res) {
      sb.append(i);
    }
    System.out.println(sb.reverse().toString());
  }

  //TODO: 回溯法的退出方法
  public static boolean buildRes(List<numMatch> set, int total, List<Integer> item) {
    if (total == 0){
//      System.out.println("here");
      return true;
    }
    else {
      boolean flag = false;
      for (numMatch match : set) {
        if (match.match <= total && !flag) {
          item.add(match.num);
//          System.out.println(item.toString());
//          System.out.println(total);
          flag = buildRes(set, total - match.match, item);
          if (flag) break;
          item.remove(item.size() - 1);
        }
      }
      return flag;
    }

  }

  static class numMatch implements Comparable<numMatch> {
    int num;
    int match;


    public numMatch(int num, int match) {
      super();
      this.num = num;
      this.match = match;
    }


    @Override
    public int compareTo(numMatch o) {
      if (this.match > o.match) {
        return 1;
      } else if (this.match < o.match) {
        return -1;
      } else {
        if (this.num > o.num) {
          return -1;
        } else
          return 1;
      }
    }

  }


}
