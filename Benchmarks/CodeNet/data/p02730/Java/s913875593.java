import java.util.Scanner;

public class Main {
    
    public static boolean isStringPalindrome(String s, int a, int b){
        StringBuilder reverse = new StringBuilder();
        for(int i = b-1; i >= a; i--){
            reverse.append(s.charAt(i));
        }
        return s.contentEquals(reverse);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int length1 = (length - 1)/2;
        String s1 = s.substring(0,length1);
        
        if(s.length() % 2 != 0 && isStringPalindrome(s,0,length) && isStringPalindrome(s1,0,length1)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
