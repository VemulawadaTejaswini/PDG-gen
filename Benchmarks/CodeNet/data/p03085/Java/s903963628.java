import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
	public static void main(String[] args) {
      Map<String, String> convert = new HashMap<>();
	convert.put("A", "T");
	convert.put("T", "A");
	convert.put("G", "C");
	convert.put("C", "G");
      
      try (Scanner scan = new Scanner(System.in)) {
        String input = scan.next();
        System.out.println(convert.get(input));
      }  
    }
}