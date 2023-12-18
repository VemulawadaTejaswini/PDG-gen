import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    int b = a.length();
    int c = (int) (b-1)/2;
    int d = (int) (b+3)/2;

    boolean a1 = check(a,0,b-1);
    boolean a2 = check(a,0,c-1);
    boolean a3 = check(a,d-1,b-1);

    if ((a1 == false) || (a2 == false) || (a3 == false)){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }


  }

  public static boolean check(String a, int b, int c){
    for (int i=b;i<c;i++){
      if (a.charAt(i) != a.charAt(c-i)){
        return false;
      }
    }
    return true;
  }
}
