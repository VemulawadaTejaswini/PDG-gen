import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      double a = Math.log(sc.nextDouble());
      double b = Math.log(sc.nextDouble());
      if(a > b){
      	System.out.println("GREATER");
      }else if(a==b){
      	System.out.println("EQUAL");
      }else{
      	System.out.println("LESS")
      }
    }
}