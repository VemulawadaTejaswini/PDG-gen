import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split("");
    long K = sc.nextLong();
    String ret = "1";
    for (int i = 0; i < 100; i++) {
      if (!S[i].equals("1")) {
        ret = S[i];
        break;
      }
      if (K == 1+i) {
        break; 
      }
    }
    System.out.println(ret);
  }
}