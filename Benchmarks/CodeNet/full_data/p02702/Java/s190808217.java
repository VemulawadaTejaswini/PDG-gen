import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();

    long count = 0;
    for(int i=0; i<S.length(); i++) {
      for(int j=i; j<S.length(); j++) {
        long m2019 = mod2019(S.substring(i, j+1));
        if(m2019 == 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

  public static long mod2019(String argInput) {
    String str = argInput;
    while(str.length() > 15) {
      long front = Long.parseLong(str.substring(0, 15));
      str = String.valueOf(front % 2019).concat(str.substring(15));
    }

    return Long.parseLong(str) % 2019;
  }
}