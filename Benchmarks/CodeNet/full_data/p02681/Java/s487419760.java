import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    String s = sc.nextLine();
    String t = sc.nextLine();
    if(s.equals(t.substring(0,s.length()))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    // System.out.println(n);
  }
}
