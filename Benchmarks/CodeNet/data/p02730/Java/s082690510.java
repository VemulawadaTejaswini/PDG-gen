import java.util.*;
import java.lang.*;

public class Main { 

    static boolean isPalindrome(String str) 
    { 
 
        int i = 0, j = str.length() - 1, N = str.length(); 

        while (i < j) { 

            if (str.charAt(i) != str.charAt(j)) 
                return false; 

            i++; 
            j--; 
        } 
        int k = ((N-1)/2);
        while (k < j) { 

            if (str.charAt(k) != str.charAt(j)) 
                return false; 

            k++; 
            j--; 
        }
        int p = ((N+3)/2);
        while (p < j) { 

            if (str.charAt(p) != str.charAt(j)) 
                return false; 

            p++; 
            j--; 
        }

        return true; 
    } 

    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
        sc.close();
    } 
} 
