import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int i=0;;i++){
      int num = 0;
      String s = sc.next();
      if(s.equals("0")) break;
      for(int j=0;j<s.length();j++){
        num += Character.digit(s.charAt(j), 10);
     }
      System.out.println(num);
    }
  }
}

