import java.util.Scanner;

public class Main {
  public static String security(String num){
    char a = num.charAt(0);
    for(int i=1; i<4; i++){
      char b = num.charAt(i);
      if(a == b) return "Bad";
      else{
        if(i != 3) a = b;
        else return "Good";
      }
    }
    return "0";
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    System.out.println(security(a));
  }
}
