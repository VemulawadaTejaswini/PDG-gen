import java.io.PrintWriter;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in)) {
      Task task = new Task();
      task.solve(sc, out);
      out.flush();

    } catch (Exception e) {
      // DO NOT USE
      e.printStackTrace();
    }
  }

  private static class Task {
    private void solve(Scanner sc, PrintWriter out) {
      // TODO
          int N = nint(sc);
          int[][] cood = new int[N][2];
          for(int i = 0;i < N;++i) {
            cood[i][0] = nint(sc);
            cood[i][1] = nint(sc);
          }
          sc.close();

          int[] len = new int[N];
          int max_len = 0;
          for(int i = 0;i < N;++i) {
            len[i] = Math.abs(cood[i][0]) + Math.abs(cood[i][1]);
            if(len[i] > max_len)
              max_len = len[i];
          }

          boolean possible = true;
          for(int i = 0;i < N;++i) {
            if(max_len % 2 != len[i] % 2)
              possible = false;
          }
          if(!possible) {
            out.println("-1");
            return;
          }

          int arm_num = max_len;
          out.println(max_len);
          out.print("1");
          for(int i = 1;i < max_len;++i)
            out.print(" 1");
          out.println();

          int[] current = new int[2];
          for(int i = 0;i < N;++i) {
            current[0] = 0;
            current[1] = 0;
            for(int j = 0;j < arm_num;++j) {
              if(current[0] < cood[i][0]) {
                out.print("R");
                current[0] += 1;
              }else if(current[0] > cood[i][0]) {
                out.print("L");
                current[0] -= 1;
              }else if(current[1] < cood[i][1]) {
                out.print("U");
                current[1] += 1;
              }else if(current[1] > cood[i][1]) {
                out.print("D");
                current[1] -= 1;
              }else {
                out.print("RL");
                j++;
              }
            }
            out.println();
          }

        }


    // method
    private static int nint(Scanner sc) {
      return Integer.parseInt(sc.next());
    }

    private static long nlong(Scanner sc) {
      return Long.parseLong(sc.next());
    }

    private static double ndouble(Scanner sc) {
      return Double.parseDouble(sc.next());
    }

    private static float nfloat(Scanner sc) {
      return Float.parseFloat(sc.next());
    }

    private static String nstr(Scanner sc) {
      return sc.next();
    }

    private static long[] longLine(Scanner sc, int size) {
      long[] lLine = new long[size];
      for (int i = 0; i < size; i++) {
        lLine[i] = nlong(sc);
      }
      return lLine;
    }

    private static int[] intLine(Scanner sc, int size) {
      int[] iLine = new int[size];
      for (int i = 0; i < size; i++) {
        iLine[i] = nint(sc);
      }
      return iLine;
    }

    private static String[] strLine(Scanner sc, int size) {
      String[] strLine = new String[size];
      for (int i = 0; i < size; i++) {
        strLine[i] = nstr(sc);
      }
      return strLine;
    }

    private static long maxFromList(List<Long> longList) {
      return longList.stream().max(Comparator.naturalOrder()).get();
    }

    private static long minFromList(List<Long> longList) {
      return longList.stream().min(Comparator.naturalOrder()).get();
    }

    private static int sumDigits(int n) {
      int sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    private static long sumDigits(long n) {
      long sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    private static List<Integer> getIntegerList(Scanner sc, int size) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nint(sc));
      }
      return list;
    }

    private static List<Long> getLongList(Scanner sc, int size) {
      List<Long> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nlong(sc));
      }
      return list;
    }

    private static long gcd(long m, long n) {
      if (m < n) return gcd(n, m);
      if (n == 0) return m;
      return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
      return m * n / gcd(m, n);
    }

    /**
     * Returns the most frequent value in the list
     *
     * @param list
     * @return most frequent value
     */
    private static Integer mode(List<Integer> list) {
      if (list.size() <= 0) {
        throw new IllegalArgumentException();
      }

      Map<Integer, Integer> modeMap = new HashMap<>();

      list.stream()
          .forEach(
              x -> {
                if (modeMap.containsKey(x)) {
                  modeMap.put(x, modeMap.get(x) + 1);
                } else {
                  modeMap.put(x, 1);
                }
              });

      int maxValue = 0;
      int maxKey = 0;

      for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
        if (maxValue < entry.getValue()) {
          maxValue = entry.getValue();
          maxKey = entry.getKey();
        }
      }

      return maxKey;
    }
  }
}
