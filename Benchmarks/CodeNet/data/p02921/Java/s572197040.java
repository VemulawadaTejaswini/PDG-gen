import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    Integer c = 0;
    for (Integer i=0;i < a.length();i++){
      char d = a.charAt(i);
      char e = b.charAt(i);
      if (d == e){
        c += 1;
      }
    }
    System.out.println(c);
  }
}