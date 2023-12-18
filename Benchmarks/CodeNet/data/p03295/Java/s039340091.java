import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Section[] sections = new Section[M];
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 2;
      sections[i] = new Section(a, b);
    }
    Arrays.sort(sections, (s1, s2) -> {
      if (s1.end != s2.end) return s2.end - s1.end;
      return s2.start - s1.start;
    });

    int cnt = 0;
    int left = 200_000;
    for (Section sec : sections) {
      if (sec.end < left) {
        cnt++;
        left = sec.start;
      }
    }
    System.out.println(cnt);
  }

  private static class Section {
    private final int start;
    private final int end;

    private Section(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }
}
