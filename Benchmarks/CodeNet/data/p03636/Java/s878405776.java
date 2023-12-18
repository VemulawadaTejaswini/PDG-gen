import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();

        System.out.println(s.substring(0,1) + String.valueOf(l-2) + s.substring(l-1));
    }
}