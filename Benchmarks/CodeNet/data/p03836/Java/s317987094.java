import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Your code here!
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    sc.close();

    int dx = tx - sx;
    int dy = ty - sy;
    
    outputLoopStr("R", dx);
    outputLoopStr("U", dy);
    outputLoopStr("L", dx);
    outputLoopStr("D", dy);

    System.out.print("D");
    outputLoopStr("R", dx+1);
    outputLoopStr("U", dy+1);
    System.out.print("L");
    System.out.print("U");
    outputLoopStr("L", dx+1);
    outputLoopStr("D", dy+1);
    System.out.print("R");
    
  }
  private static void outputLoopStr(String s, int n){
    for(int i = 0; i < n; i++){
      System.out.print(s);
    }
  }
}
