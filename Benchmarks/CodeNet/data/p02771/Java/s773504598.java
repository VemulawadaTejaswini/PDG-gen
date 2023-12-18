import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        if(a.charAt(0)==b.charAt(0) && b.charAt(0) == c.charAt(0)){
            System.out.println("No");
        }else if(a.charAt(0) != b.charAt(0) && a.charAt(0) != c.charAt(0) && b.charAt(0) != c.charAt(0)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}