import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = "";
      if( 400 <= n && n < 600 ){
        s = "8";
      }else if( 400 <= n && n < 800 ){
        s = "7";
      }else if( 400 <= n && n < 1000 ){
        s = "6";
      }else if( 400 <= n && n < 1200 ){
        s = "5";
      }else if( 400 <= n && n < 1400 ){
       s = "4";
      }else if( 400 <= n && n < 1600 ){
        s="3";
      }else if( 400 <= n && n < 1800 ){
        s="2";
      }else if( 400 <= n && n < 2000 ){
        s="1";
      }
      System.out.println(s);
	}
}