import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int max = 0;

    for (int i = 0; i < n; i++) {
      String first = s.substring(0,i+1);
      String last = s.substring(i+1,n);
      char[] data1 = first.toCharArray();
      char[] data2 = last.toCharArray();
      int[] table1 = new int[26];
      int[] table2 = new int[26];

      for (int j = 0; j < first.length(); j++) {
        table1[data1[j]-'a']++;
      }
      for (int j = 0; j < last.length(); j++) {
        table2[data2[j]-'a']++;
      }

      int count = 0;
      for (int j = 0; j < 26; j++) {
        if (table1[j] > 0 && table2[j] > 0) {
          count++;
        }
      }
      max = Math.max(max,count);
    }

    System.out.println(max);

  }
}
