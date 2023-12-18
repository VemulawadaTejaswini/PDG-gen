import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String text = sc.nextLine();
    	if (text.length() == 2) {
    		System.out.println(text);
    	} else {
    		StringBuffer sb = new StringBuffer(text);
    		System.out.println(sb.reverse());
    	}
    	sc.close();
    }
}