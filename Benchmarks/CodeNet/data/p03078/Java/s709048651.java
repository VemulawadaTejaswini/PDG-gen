import java.util.*;

public class Main {

  private long[] tasteList;
  private int k = 0;

  public static void main(String[] args) {
    Main m = new Main();
    m.read();
    m.exec();
  }

  private void read() {
	tasteList = new long[10];
  }

  private void exec() {
    Arrays.sort(tasteList);
    for (int i = 1; i <= k; i++) {
      System.out.println(String.valueOf(tasteList[tasteList.length - i]));
    }
  }
}