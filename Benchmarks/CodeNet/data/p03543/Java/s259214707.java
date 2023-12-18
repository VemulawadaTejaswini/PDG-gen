
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String str = input.nextLine();
    	String ans = "No";
    	int cnt = 1;
    	char ch = str.charAt(0);
    	for (int i = 0; i < str.length(); i++) {

    		if ((i+1) == str.length()) {
    			break;
    		}

    		if (ch==str.charAt(i + 1)) {
    			cnt++;
    		}else {
    			cnt = 1;
    			ch = str.charAt(i + 1);
    		}
    		if (cnt == 4) {
    			ans = "Yes";
    			break;
    		}
    	}
    	System.out.println(ans);
    }
}

