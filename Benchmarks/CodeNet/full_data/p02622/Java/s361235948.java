import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int out = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)) out++;
        }
        System.out.println(out);
        scan.close();
    }
}