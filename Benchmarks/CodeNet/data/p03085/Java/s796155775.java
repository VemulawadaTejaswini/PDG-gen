import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String b = sc.nextLine();
	System.out.println(check(b));
  }
  
  static String check(String b) {
    		switch(b) {
        case "A":
          return "T";
        case "T":
          return "A";
        case "G":
          return "C";
        case "C":
          return "G";
              default:
                break;
        }
    return null;
  }
  
}