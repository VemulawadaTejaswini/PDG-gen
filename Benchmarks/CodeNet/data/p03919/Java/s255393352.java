import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
        
        for (int parent = 1; parent <= h; parent++) {
          for (int child = 1; child <= w; child++) {
             if (sc.next().equals("snuke")) {
               // 出力
		       System.out.println(getCharForNumber(child) + parent);
               break;
             }
          }
        }
	}
  private static String getCharForNumber(int i) {
    return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
}