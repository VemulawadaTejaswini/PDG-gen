import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();  // input Integer
    String a = sc.next();  // input String

    if( Character.isUpperCase(a.charAt(0) ) ) {
	    System.out.println("A");
	}
    else {
        System.out.println( "a" );
    }
  }
}