import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
	  	result = Character.getNumericValue(str.charAt(i));
    }
    System.out.println(result);
  }
}
