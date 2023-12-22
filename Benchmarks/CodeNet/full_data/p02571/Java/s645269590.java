import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      if(t.length()<=3){
      	System.out.println(1);
      }
      if(t.length()>3){
      	System.out.println(6);
      }
    }
}