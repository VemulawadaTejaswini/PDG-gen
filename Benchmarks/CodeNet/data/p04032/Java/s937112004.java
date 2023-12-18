import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    System.out.println(check(S));
    sc.close();
  }
  static String check(String s) {
    char[] cList = s.toCharArray();
    //aaパターン
    for (int i = 0; i < cList.length - 1 ; i++) {
      if (cList[i] == (cList[i+1])) {
        return (i+1) + " " + (i+2);
      }
    }
    //abaパターン
    for (int i = 0; i < cList.length - 2 ; i++) {
      if (cList[i] == (cList[i+2])) {
        return (i+1) + " " + (i+3);
      }
    }
    // no match
    return (-1) + " " + (-1);
  }
}