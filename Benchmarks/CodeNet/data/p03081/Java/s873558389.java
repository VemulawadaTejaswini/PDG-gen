import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    {
      Scanner scanner = new Scanner(System.in);
      int N = Integer.parseInt(scanner.next());
      int Q = Integer.parseInt(scanner.next());
      String s = scanner.next();
      String[] t = new String[Q];
      String[] d = new String[Q];
      for (int i = 0; i < Q; i++) {
        t[i] = scanner.next();
        d[i] = scanner.next();
      }
      scanner.close();
      int[] line = new int[s.length()];
      Arrays.fill(line, 1);
      ArrayList<ArrayList<Integer>> alphabet = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < 26; i++) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        alphabet.add(tmp);
      }
      for (int i = 0; i < N; i++) {
        alphabet.get(s.charAt(i) - 'A').add(i);
      }
      for (int i = 0; i < Q; i++) {
        if (d[i].equals("L")) {
          int index = t[i].charAt(0) - 'A';
          for (int value : alphabet.get(index)) {
            if (value != 0) {
              line[value - 1] += line[value];
            }
            line[value] = 0;
          }
        } else {
          int index = t[i].charAt(0) - 'A';
          for (int value : alphabet.get(index)) {
            if (value != N - 1) {
              line[value + 1] += line[value];
            }
            line[value] = 0;
          }
        }
      }

      int sum = 0;
      for (int i : line) {
        sum += i;
      }
      System.out.println(sum);
    }

  }

}
