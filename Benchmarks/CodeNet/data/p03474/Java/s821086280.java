import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
	  int a = sc.nextInt();
      int b = sc.nextInt();
      String s = sc.next();
      
      Pattern p = Pattern.compile("^[0-9]{"+a+"}-[0-9]{"+b+"}$");
      Matcher m = p.matcher(s);
      if(m.matches()){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
