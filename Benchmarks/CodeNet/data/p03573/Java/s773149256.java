public class Main {
  public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
           s[i] = scanner.next();
        }
        for (int i = 0; i < h; i++) {
            boolean isUe = (i - 1) >= 0;
            boolean isShita = (i+1) < h;
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < w; j++) {
               if (s[i].charAt(j) == '#') {
                 builder.append("#");
                 continue;
               }
            int count = 0;
              boolean isHidari = ((j-1) >= 0);
              boolean isMigi = (j+1) < w;
              if (isUe) {
                 if (isHidari && s[i - 1].charAt(j - 1) == '#') { count++; };
                 if (s[i-1].charAt(j) == '#') { count++; };
                 if (isMigi && s[i - 1].charAt(j + 1) == '#') { count++; }
              }
                 if (isHidari && s[i].charAt(j - 1) == '#') { count++; }
                 if (isMigi && s[i].charAt(j + 1) == '#') { count++; }
              if (isShita) {
                 if (isHidari && s[i + 1].charAt(j - 1) == '#') { count++; }
                 if (s[i+1].charAt(j) == '#') { count++; }
                 if (isMigi && s[i + 1].charAt(j + 1) == '#') { count++; }
              }
            builder.append(count);
            }
        System.out.println(builder.toString());
        }
 }

}
