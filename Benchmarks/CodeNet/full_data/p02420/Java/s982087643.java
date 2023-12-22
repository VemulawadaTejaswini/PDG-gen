import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      String str = sc.next();
      if (str.equals("-")) break;
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        int s = sc.nextInt();
        String str1 = str.substring(s);
        String str2 = str.substring(0, s);
        str = str1 + str2;        
      }
      System.out.println(str);
    }
  }
}
