import java.util.*;

 public class Main {
     
    static boolean isPalindrome(char str[], int l, int h) 
    { 
        while (h > l) 
        { 
            if (str[l++] != str[h--]) 
            { 
                return false; 
            } 
        } 
        return true; 
    } 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if(n%2==0) {
            System.out.println("NO");
        }
        else {
            if( isPalindrome(s.toCharArray(), 0, (n-3)/2) && isPalindrome(s.toCharArray(), (n+1)/2, n-1) ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}