import java.util.regex.Pattern;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String S = s.next();
      	String T = s.next();
		Pattern p = Pattern.compile(S + "[a-z]$");
		if(p.matcher(T).find()){
          return "Yes";
        }else {
          return "No";
        }
    }
}