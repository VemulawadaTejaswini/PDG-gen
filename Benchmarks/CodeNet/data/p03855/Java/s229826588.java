import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int L = sc.nextInt();
    int[] load = new int[N];
    for (int i = 0; i < N; i++) {
      load[i] = i + 1;
    }
    int[] rail = new int[N];
    for (int i = 0; i < N; i++) {
      rail[i] = i + 1;
    }
    for (int i = 0; i < K; i++) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;
      int groupP = load[p];
      int groupQ = load[q];
      for (int j = 0; j < N; j++) {
        if (load[j] == groupQ) {
          load[j] = groupP;
        }
      }
    }
    for (int i = 0; i < L; i++) {
      int r = sc.nextInt() - 1;
      int s = sc.nextInt() - 1;
      int groupR = rail[r];
      int groupS = rail[s];
      for (int j = 0; j < N; j++) {
        if (rail[j] == groupS) {
          rail[j] = groupR;
        }
      }
    }
    sc.close();

    String result = "";
    for (int i = 0; i < N; i++) {
      if (result != "") {
        result += " ";
      }
      int count = 0;
      for (int j = 0; j < N; j++) {
        if (load[i] == load[j] && rail[i] == rail[j]) {
          count += 1;
        }
      }
      result += count;
    }
    System.out.println(result);
  }
}
