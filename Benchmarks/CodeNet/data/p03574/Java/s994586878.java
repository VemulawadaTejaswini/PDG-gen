import java.util.*;

public class Main{

  static void check(String[][] s, int[][] a, int y, int x){
    if (!s[y][x].equals("#")){
      if (y!=0){
        if (s[y-1][x].equals("#"))
        a[y][x] += 1;
        if (x!=0){
          if (s[y-1][x-1].equals("#"))
          a[y][x] += 1;
        }
        if (x !=s[0].length-1){
          if (s[y-1][x+1].equals("#"))
          a[y][x] += 1;
        }
      }
      if (x !=s[0].length-1){
        if (s[y][x+1].equals("#"))
        a[y][x] += 1;
      }
      if (x !=0){
        if (s[y][x-1].equals("#"))
        a[y][x] += 1;
      }
      if (y!=s.length-1){
        if (s[y+1][x].equals("#"))
        a[y][x] += 1;
        if (x!=0){
          if (s[y+1][x-1].equals("#"))
          a[y][x] += 1;
        }
        if (x !=s[0].length-1){
          if (s[y+1][x+1].equals("#"))
          a[y][x] += 1;
        }
      }
    }else{
      a[y][x] = -1;
    }
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());

    String[][] s = new String[h][w];
    int[][] a = new int[h][w];

    for (int i=0; i<h; i++){
      s[i] = sc.next().split("", -1);
    }


    for (int i=0; i<h; i++){
      for (int j=0; j<w; j++){
        check(s, a, i, j);
        if (a[i][j] != -1)
        System.out.print(a[i][j]);
        else
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
