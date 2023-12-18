import java.io.*;
import java.util.*;


public class Main {
    public static boolean checkPalindrom(String S){
        boolean isPalindrome=true;
        for (int i=0,j=S.length()-1;i<S.length();i++,j--){
            if (S.charAt(i)!=S.charAt(j)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        boolean isPalindrome1=true;
        boolean isPalindrome2=true;
        boolean isPalindrome3=true;
        isPalindrome1=checkPalindrom(S);
        isPalindrome2=checkPalindrom(S.substring(0,(N-1)/2));
        if (N<5){
            isPalindrome3=checkPalindrom(S.substring(((N+3)/2),N-1));
        }else{
            isPalindrome3=false;
        }
        System.out.println(isPalindrome1&&isPalindrome2&&isPalindrome3? "Yes":"No");
    }
}
