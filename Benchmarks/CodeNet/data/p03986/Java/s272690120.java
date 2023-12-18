public class Solution {
  public static void main(String[] args) {
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
      StringBuilder sb = new StringBuilder();
      char[] s = sc.next().toCharArray();
      int len = s.length;
      for (int i = 1, j = 0; i < s.length; i++) {
        if (s[j] == 'S' && s[i] == 'T') {
            len -= 2;
          if (j != 0) {
            j--;
          } else {
            j = i + 1;
            i = j;
          }
        } else j++;
      }
      System.out.println(len);
    }
  }
}
