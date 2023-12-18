import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean hitN = false;
    boolean hitE = false;
    boolean hitW = false;
    boolean hitS = false;
    for(int i = 0; i < S.length(); i++){
      // System.out.println(S.charAt(i));
      switch(S.charAt(i)) {
        case 'N':
          hitN = true;
          break;
        case 'W':
          hitW = true;
          break;
        case 'E':
          hitE = true;
          break;
        case 'S':
          hitS = true;
          break;
      }
    }

    System.out.println((hitN == hitS && hitW == hitE) ? "Yes" : "No");
  }
}
