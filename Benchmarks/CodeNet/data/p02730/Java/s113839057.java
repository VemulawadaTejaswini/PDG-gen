import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s= scan.next();
        if(isPalindrome(s)){
            String s1,s2;
            s1=s.substring(0,(s.length()-1)/2);
            //System.err.println(s1);
            s2=s.substring((s.length()+3)/2-1,s.length());
            //System.err.println(s2);
            if(isPalindrome(s1)&&isPalindrome(s2)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
