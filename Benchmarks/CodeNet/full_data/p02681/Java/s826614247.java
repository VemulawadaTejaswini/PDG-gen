import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S=sc.next();
    String T=sc.next();
    int X=T.length();
    String Z=T.substring(0,X-1);
    if(S.equals(Z)) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}