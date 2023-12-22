import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    int lowest = Integer.parseInt(strs[0]);
    int highest = Integer.parseInt(strs[1]);
    int n = Integer.parseInt(strs[2]);
    int count = 0;
    for (int i = lowest; i < highest+1; i++) {
      if(i % n == 0) count++;
    }
    System.out.println(count);
  }

}
