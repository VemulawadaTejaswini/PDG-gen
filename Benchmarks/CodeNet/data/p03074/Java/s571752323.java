import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int K = in.nextInt();
    char[] s = in.next().toCharArray();

    List<Integer> nums = new ArrayList<Integer>();

    char prev = s[0];
    int count = 1;

    for (int i = 1; i < N; i++) {
      if (prev == s[i]) {
        count++;
      } else {
        nums.add(count);
        count = 1;
        prev = s[i];
      }
    }
    nums.add(count);

    // Make nums start with '0' count
    if (s[0] == '1') {
      nums.add(0, 0);
    }
    // Make num ends with '0' count
    if (s[N - 1] == '1') {
      nums.add(0);
    }

    int numflip = 0;
    int ans = 0;
    int curr = 0;

    for (int i = 0; i < nums.size(); i++) {
      // We are looking at '0' count
      if (i % 2 == 0) {
        if (numflip < K) {
          numflip++;
        } else {
          int kickedOut0Index = i - K * 2;
          curr -= nums.get(kickedOut0Index);
          if (0 < kickedOut0Index) {
            curr -= nums.get(kickedOut0Index - 1);
          }
        }
        curr += nums.get(i);
      }
      // We are looking at '1' count
      else {
        curr += nums.get(i);
      }
      ans = Math.max(ans, curr);
    }

    ans = Math.max(ans, curr);

    System.out.println(ans);

  }
}