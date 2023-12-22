import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
   	int k;
    k = scan.nextInt();
   	String s;
    s = scan.next();
    int num = s.length();
    if (k>=num)
      System.out.println(s);
    else{
      String str= s.substring(s.length() - k);
      System.out.println(str+"...");
    }
  }         
}
