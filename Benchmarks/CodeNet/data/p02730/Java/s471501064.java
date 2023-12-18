import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        if (isPalindrome(str)&& is2Palindrome(str)&& is3Palindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static boolean isPalindrome(String str){
        for (int i = 0,j=str.length()-1; i <j; i++,j--) {
            if(str.charAt(i)!=str.charAt(j))return false;
        }
        return true;
    }
    public static boolean is2Palindrome(String str){
        for (int i = 0,j=(str.length()-1)/2-1; i <j; i++,j--) {
            if(str.charAt(i)!=str.charAt(j))return false;
        }
        return true;
    }
    public static boolean is3Palindrome(String str){
        for (int i = (str.length()+3)/2-1,j=str.length()-1; i <j; i++,j--) {
            if(str.charAt(i)!=str.charAt(j))return false;
        }
        return true;
    }

}
