import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] data = new char[n];
    String s = sc.next();
    int count = 1;

    for(int i = 0;i < n;i++) {
      data[i] = s.charAt(i);
    }

    for(int i = 0;i < n-1;i++) {
      if(data[i] == data[i+1]) {
        continue;
      } else {
        count++;
      }
    }

    System.out.println(count);

  }

}
