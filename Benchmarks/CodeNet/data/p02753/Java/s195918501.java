import java.util.*;
public class Main { //クラス名はMain
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	      String line = sc.nextLine();
      
      	String[] val = line.split("");
      	// System.out.println(val[0]);
      	if (val[0].equals(val[1])) {
          if (val[1].equals(val[2])) {
          System.out.println("No");
          }
          else {
          System.out.println("Yes");
          }
        } else {
          System.out.println("Yes");
        }
    }
}