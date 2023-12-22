import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String word = in.next();
        if (word[-1] == "s") {
        	System.out.println(word + "es");
        } else {
        	System.out.println(word + "s");
        }
      	in.close();
    }
}