import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int s = sc.nextInt();

    String str = sc.next();
    String[] strList = str.split("");

    for (int i = 0; i < s; i++) {
      int start = sc.nextInt() - 1;
      int end = sc.nextInt() - 1;

      int count = 0;
      
      for (int j = start; j < end; j++) {

        if(strList[j].equals("A") && strList[j+1].equals("C")) {
          count++;
        } 
      }
      
      System.out.println(count);
    }
  }
}
