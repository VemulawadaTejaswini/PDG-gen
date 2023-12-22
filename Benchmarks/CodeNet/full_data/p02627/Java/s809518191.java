import java.util.Scanner;

class Alphabet{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    if(isLower(str)){
      System.out.print("a");
    }else{
      System.out.print("A");
    }
  }
  static boolean isLower(String str){
    return str.equals(str.toLowerCase);
  }
}