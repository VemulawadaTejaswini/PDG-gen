    import java.util.*;
     
    public class Main {
    	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();	
    	String s = String.valueOf(num);
    if(isPalindrome(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
           }
    	}
     
    public static boolean isPalindrome(String sentence) {
            int minIdx = 0;
            int maxIdx = sentence.length() - 1;
     
            while(minIdx < maxIdx) {
                if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
                    return false;
                }
            }
            return true;
        }
    }