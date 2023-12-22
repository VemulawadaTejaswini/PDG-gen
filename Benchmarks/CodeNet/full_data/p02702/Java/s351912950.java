public class Main {
  public static void main(final String[] args) throws Exception {
    int[] x = new int[200000];
    int ln;
    for (ln = 0; ln < x.length; ln++) {
      int c = System.in.read();
      if (c == '\n' || c == -1) {
        break;
      }
      x[ln] = c - '0';
    }

    int a = 0;
    for (int i = 0, m = 0; i < ln; i++, m = 0) {
      for (int j = i; j < ln; j++) {
        m = ((m << 3) + (m << 1) + x[j]) % 2019;
        if (m == 0) {
          a++;
        }

      }
    }
    System.out.println(a);
  }
}
