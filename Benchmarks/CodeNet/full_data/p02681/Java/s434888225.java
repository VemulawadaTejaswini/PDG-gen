import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.substring(0,a.length()-1).equals(b) || b.substring(0,b.length()-1).equals(a)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
