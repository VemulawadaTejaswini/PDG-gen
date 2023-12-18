import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s_s = "";
        for(int i = 0; i < s.length();i=i+2){
            s_s = s_s + s.charAt(i);
        }
        System.out.println(s_s);
    }
}