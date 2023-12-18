import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	String S = sc.next();

    	boolean result1 = isPalindrome(S);
    	boolean result2 = isPalindrome(S.substring(0, (S.length()-1)/2));
    	if(result1&&result2) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }

    public static boolean isPalindrome(String s) {

    	boolean result = true;

    	if(s.length()%2==0) {
    		char[] arr = s.toCharArray();
    		for(int i=0;i<s.length()/2;i++) {
    			if(arr[i]!=arr[s.length()-1-i]) {
    				result = false;
    			}
    		}
    	} else {
    		char[] arr = s.toCharArray();
    		for(int i=0;i<(s.length()-1)/2;i++) {
    			if(arr[i]!=arr[s.length()-1-i]) {
    				result = false;
    			}
    		}
    	}

    	return result;
    }

}
