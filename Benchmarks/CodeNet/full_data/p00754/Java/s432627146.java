
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String s = scan.nextLine();
            if(s.equals("."))break;
            if(search(s))System.out.println("yes");
            else System.out.println("no");

        }
        
        scan.close();
    }

    static boolean search(String s){
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('){
                int x = findMaruKakko(s, i+1);
                if(x == -1)return false;
                else i = x;
                continue;
            }
            if(s.charAt(i) == '['){
                int x = findShikakuKakko(s, i+1);
                if(x == -1)return false;
                else i = x;
                continue;
            }
            if(s.charAt(i) == ')')return false;
            if(s.charAt(i) == ']')return false;
            
        }
        return true;
    }

    static int findMaruKakko(String s, int begin){
        for(int i = begin;i < s.length();i++){
            if(s.charAt(i) == ')')return i;
            if(s.charAt(i) == ']')return -1;
            if(s.charAt(i) == '('){
                int x = findMaruKakko(s, i+1);
                if(x == -1)return -1;
                else i = x;
                continue;
            }
            if(s.charAt(i) == '['){
                int x = findShikakuKakko(s, i+1);
                if(x == -1)return -1;
                else i = x;
                continue;
            }
        }
        return -1;

    }

    static int findShikakuKakko(String s, int begin){
        for(int i = begin;i < s.length();i++){
            if(s.charAt(i) == ']')return i;
            if(s.charAt(i) == ')')return -1;
            if(s.charAt(i) == '('){
                int x = findMaruKakko(s, i+1);
                if(x == -1)return -1;
                else i = x;
                continue;
            }
            if(s.charAt(i) == '['){
                int x = findShikakuKakko(s, i+1);
                if(x == -1)return -1;
                else i = x;
                continue;
            }
                
            
        }
        return -1;

    }
    

}
