import java.util.regex.Pattern;

Class Main {
 public static void main(String...args) {
   		Pattern p = Pattern.compile(S + "[a-z]$");
		return p.matcher(T).find() ? "Yes" : "No";
 }
  
  
}