import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
	  Scanner scanner = new Scanner(System.in);
	  String s = scanner.nextLine();
      String t = scanner.nextLine();
      if(t==null || t.length()==0) System.out.print("No");
      else if(t.substring(0,t.length()-1).contentEquals(s)) System.out.print("Yes");
      else System.out.print("No");
  }
}