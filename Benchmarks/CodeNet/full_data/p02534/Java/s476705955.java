import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.close();
    String s = "";
    for(int i = 0; i < k; i++){
      s += "ACL";
    }
    System.out.println(s);
  }
}