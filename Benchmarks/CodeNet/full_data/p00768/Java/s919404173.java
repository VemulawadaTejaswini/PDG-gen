import java.util.*;

class Main {

  static class Info {
    private int acCount, acTime;
    public Info(int count, int time) {
      this.acCount = count;
      this.acTime = time;
    }
    public int getCount() {
      return acCount;
    }
    public int getTime() {
      return acTime;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int M = sc.nextInt();
      int T = sc.nextInt();
      int P = sc.nextInt();
      int R = sc.nextInt();
      if (M == 0 && T == 0 && P == 0 && R == 0) return;

      Map<Integer, Info> info_map = new HashMap<>();
      int waCount[][] = new int[T][P];

      for (int i = 0; i < T; i++) {
        info_map.put(i, new Info(0, 0));
      }

      for (int i = 0; i < R; i++) {
        int m = sc.nextInt();
        int t = sc.nextInt()-1;
        int p = sc.nextInt()-1;
        int j = sc.nextInt();
        if (j != 0) {
          waCount[t][p]++;
        }
        else {
          int count = info_map.get(t).getCount() + 1;
          int time = info_map.get(t).getTime() + m + (waCount[t][p]*20);
          info_map.put(t, new Info(count, time));
        }
      }

      List<Map.Entry<Integer, Info>> info_list = new ArrayList<>(info_map.entrySet());
      Collections.sort(info_list, new MyComparator());

      /*
      for (Map.Entry<Integer, Info> entry : info_list) {
        System.out.println("Team" + (entry.getKey() + 1) + " : " +
                          entry.getValue().getCount() + "AC, " +
                          entry.getValue().getTime() + "time");
      }
      */

      for (int i = 0; i < T; i++) {
        if (i == 0) {
          System.out.print(info_list.get(0).getKey() + 1);
        }
        else {
          String s = "";
          Info xInfo = info_list.get(i-1).getValue();
          Info yInfo = info_list.get(i).getValue();
          if (xInfo.getCount() == yInfo.getCount()
           && xInfo.getTime() == yInfo.getTime()) s = "=";
           else s = ",";
           System.out.print(s + (info_list.get(i).getKey() + 1) );
        }
      }
      System.out.println();
    }
  }

  static class MyComparator implements Comparator<Map.Entry<Integer, Info>> {
    public int compare(Map.Entry<Integer, Info> x, Map.Entry<Integer, Info> y) {
      int xCount = x.getValue().getCount();
      int yCount = y.getValue().getCount();
      int xTime = x.getValue().getTime();
      int yTime = y.getValue().getTime();
      int xTeamNo = x.getKey();
      int yTeamNo = y.getKey();

      if (xCount == yCount) {
        if (xTime == yTime) return yTeamNo - xTeamNo;
        else return xTime - yTime;
      }
      return yCount - xCount;
    }
  }
}

