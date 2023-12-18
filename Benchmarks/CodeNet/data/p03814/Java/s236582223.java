import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.next();



    int firstA = S.indexOf("A");
    int lastZ  = S.lastIndexOf("Z");
    System.out.println( lastZ - firstA + 1 );


  }
}
