import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        
        String str1 = s1.toUpperCase();
        String str2 = s2.toUpperCase();
        String str3 = s3.toUpperCase();
        
        System.out.print(str1.charAt(0));
        System.out.print(str2.charAt(0));
        System.out.print(str3.charAt(0));
    }
}
