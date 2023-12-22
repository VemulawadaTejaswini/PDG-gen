import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (true) {
      String str = sc.next();
      if (str.equals("\n")) {
        break;
      }
      char ch[] = str.toCharArray();
      for (int idx = 0; idx < str.length(); idx++) {
        if (Character.isUpperCase(ch[idx])) {
          ch[idx] = Character.isLowerCase(ch[idx]);
        }
        else if (Character.isLowerCase(ch[idx])) {
          ch[idx] = Character.isUpperCase(ch[idx]);
        }
      }
      for (int idx = 0; idx < str.length(); idx++) {
        System.out.print(ch[idx]);
      }
      System.out.print(" ");
    }
  }
}