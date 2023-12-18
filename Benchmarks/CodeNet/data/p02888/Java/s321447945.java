import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Integer[] l = new Integer[n];

    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }

    Arrays.sort(l, Collections.reverseOrder());

    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          if (l[i] + l[j] <= l[k]) {
            break;
          } else {
            if (l[i] + l[k] <= l[j]) {
              break;
            } else {
              if (l[i] + l[j] > l[k]) ans++;
            }
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}
