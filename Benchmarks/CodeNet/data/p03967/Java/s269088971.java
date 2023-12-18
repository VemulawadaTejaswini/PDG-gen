import java.util.Scanner;
 
public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);

    char[] s = sc.nextLine().toCharArray();

    int count0 = 0;
    int count1 = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'g') {
        count0++;
      } else {
        count1++;
      }
    }

    System.out.println(Math.min(count0, (int)((count0 - count1)/2)));
  }
 
  public static void main(String[] args) {
    new Main().run();
  }
}
