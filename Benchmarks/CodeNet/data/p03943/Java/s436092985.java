import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        //aが一番大きいとき
        if( a > b && a > c && a == b + c )System.out.println("Yes");
        
        //bが
        else if( b > a && b > c && b == a + c )System.out.println("Yes");
            
        //cが
        else if( c > a && c > b && c == a + b )System.out.println("Yes");
        
        else System.out.println("No");
	  }
}