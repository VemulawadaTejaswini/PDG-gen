import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    int s, t, result = 0;
    String str;
    Scanner scanner = new Scanner(System.in);
    str = scanner.nextLine();
    for (int i = 0; i < str.length();) {
        s = t = 0;
        while (i < str.length() && str.charAt(i) == 'S') {
            s++;
            i++;
        }
        while (i < str.length() && str.charAt(i) == 'T') {
            t++;
            i++;
        }
        if (t > s) {
            result += s;
        } else {
            result += t;
        }
    }
    System.out.println(str.length() - result * 2);
  }
}