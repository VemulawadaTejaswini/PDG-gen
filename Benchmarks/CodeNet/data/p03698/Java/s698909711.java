import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    //char 'a' -> int 97

    boolean result = true;
    for(int i = 'a' ;i <= 'z' ; i ++  ){
      if( S.indexOf( i ) != S.lastIndexOf( i ) ){
        result = false;
        break;
      }
    }
    System.out.println( result ? "yes" : "no" );

  }
}
