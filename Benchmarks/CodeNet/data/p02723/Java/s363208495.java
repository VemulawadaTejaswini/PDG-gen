import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c[] = new char[6];
    c = s.toCharArray();
    if(c[2]==c[3]&&c[4]==c[5]){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}