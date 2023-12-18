import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String letters = "ACGT";
 
    char letter = scanner.next().charAt(0);
	for (int ix = 0; ix < letters.length(); ix++) {
      if (letters.charAt(ix) == letter) {
		System.out.println(letters.charAt(letters.length() - ix - 1)); 
      }
    }
  }
}