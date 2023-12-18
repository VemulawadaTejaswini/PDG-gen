import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        System.out.print(Character.toString(s1.charAt(0)).toUpperCase());
        System.out.print(Character.toString(s2.charAt(0)).toUpperCase());
        System.out.print(Character.toString(s3.charAt(0)).toUpperCase());
        scan.close();
    }
};