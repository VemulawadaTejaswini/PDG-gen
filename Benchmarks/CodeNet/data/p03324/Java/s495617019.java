import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String[] hedderInfo = line.split("\\s+");
      
      long present = 100;                        // プレゼント対象
      long D = Long.parseLong(hedderInfo[0]);  // 割る回数
      long N = Long.parseLong(hedderInfo[1]);  // 掛ける回数
      
      for (int i = 1; i < D; i++) {
        present = present * present; // D回掛けると、割る回数になる
      }
      
      if (D == 0) {
        present = 1;
      }

      System.out.println(present * N);
    }

}