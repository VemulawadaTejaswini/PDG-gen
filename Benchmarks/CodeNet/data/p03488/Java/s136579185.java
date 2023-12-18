import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int x = sc.nextInt();
    int y = sc.nextInt();
    ArrayList<Integer> listx = new ArrayList<Integer>();
    ArrayList<Integer> listy = new ArrayList<Integer>();
    int p = 0;
    int t = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'F') {
        t++;
      } else {
        if(p == 0) listx.add(t);
        if(p == 1) listy.add(t);
        t = 0; 
        p = 1 - p;
      }
    }
    if(t > 0) {
       if(p == 0) listx.add(t);
       if(p == 1) listy.add(t);      
    }
    int sx = listx.size();
    int sy = listy.size();
    int len = s.length();
    boolean[][] dpx = new boolean[sx + 1][2 * len + 1];
    boolean[][] dpy = new boolean[sy + 1][2 * len + 1];
    dpx[0][len] = true;
    dpy[0][len] = true;
    for(int i = 1; i <= sx; i++) {
      for(int j = 0; j <= 2 * len; j++) {
        boolean f = false;
        if(j - listx.get(i - 1) >= 0) f = f || dpx[i - 1][j - listx.get(i - 1)];
        if(j + listx.get(i - 1) <= 2 * len) f = f || dpx[i - 1][j + listx.get(i - 1)];
        dpx[i][j] = f;
      }
    }
    for(int i = 1; i <= sy; i++) {
      for(int j = 0; j <= 2 * len; j++) {
        boolean f = false;
        if(j - listy.get(i - 1) >= 0) f = f || dpy[i - 1][j - listy.get(i - 1)];
        if(j + listy.get(i - 1) <= 2 * len) f = f || dpy[i - 1][j + listy.get(i - 1)];
        dpy[i][j] = f;        
      }
    }
    String ans = "No";
    if(dpx[sx][len + x] && dpy[sy][len + y]) ans = "Yes";
    System.out.println(ans);
  }
}