import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Integer> al = new ArrayList<>();
    List<Integer> bl = new ArrayList<>();
    al.add(sc.nextInt());
    bl.add(sc.nextInt());
    int a;
    int b;
    int ag;
    int bg;
    int max;
    int min;
loop:
    for (int i=0;i<m-1;i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      for (int j=0;j<al.size();j++) {
        ag = al.get(j);
        bg = bl.get(j);
        min = Math.max(a,ag);
        max = Math.min(b,bg);
        if (min<max) {
          al.set(j,min);
          bl.set(j,max);
          continue loop;
        }
      }
      al.add(a);
      bl.add(b);
    }
    System.out.println(al.size());
  }
}
