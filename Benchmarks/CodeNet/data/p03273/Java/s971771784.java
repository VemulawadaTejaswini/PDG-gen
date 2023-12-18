import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[][] fig = new String[h][w];
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        String t = String.valueOf(s.charAt(j));
        fig[i][j] = t;
      }
    }
    ArrayList<Integer> row = new ArrayList<Integer>();
    ArrayList<Integer> col = new ArrayList<Integer>();
    for(int i = 0; i < h; i++) {
      int p = 0;
      for(int j = 0; j < w; j++) {
        if(fig[i][j].equals("#")) p++;
      }
      if(p > 0) row.add(i); 
    }
    for(int j = 0; j < w; j++) {
      int p = 0;
      for(int i = 0; i < h; i++) {
        if(fig[i][j].equals("#")) p++;
      }
      if(p > 0) col.add(j); 
    }
    Collections.sort(row);
    Collections.sort(col);
    for(int i = 0; i < row.size(); i++) {
      String str = "";
      for(int j = 0; j < col.size(); j++) {
        str += fig[row.get(i)][col.get(j)];
      }
      System.out.println(str);
    }
  }
}
