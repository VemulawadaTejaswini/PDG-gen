import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str[] = new String[n];
    String strtop = null;
    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
      if (i == 0 || str[i].compareTo(strtop) < 0) {
        strtop = str[i];
      }
    }
    System.out.println(strtop);
  }
}