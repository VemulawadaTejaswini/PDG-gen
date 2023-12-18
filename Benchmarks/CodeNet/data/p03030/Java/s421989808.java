import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String[] s = new String[n];
    int[] p = new int[n];
    int[] num = new int[n];

    for(int i = 0; i < n; i++) {
      s[i] = stdIn.next();
      p[i] = stdIn.nextInt();
      num[i] = i+1;
    }

    for(int i = 0; i < n; i++) {
      for(int j = n-1; j >= i+1; j--) {
        if(s[j].compareTo(s[j-1]) < 0) {
          String temp = s[j-1];
          s[j-1] = s[j];
          s[j] = temp;
          int tempi = p[j-1];
          p[j-1] = p[j];
          p[j] = tempi;
          int tempn = num[j-1];
          num[j-1] = num[j];
          num[j] = tempn;
        }else if(s[j].compareTo(s[j-1]) == 0) {
          if(p[j-1] < p[j]) {
            String temp = s[j-1];
            s[j-1] = s[j];
            s[j] = temp;
            int tempi = p[j-1];
            p[j-1] = p[j];
            p[j] = tempi;
            int tempn = num[j-1];
            num[j-1] = num[j];
            num[j] = tempn;
          }
        }
      }
    }


    for(int i = 0; i < n; i++) {
      System.out.println(num[i]);
    }
  }
}