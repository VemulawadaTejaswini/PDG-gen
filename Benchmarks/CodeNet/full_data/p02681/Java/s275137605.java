import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        String result = "No";
        if (a.equals(b.substring(0, b.length()-1))) {
            result = "Yes";
        }
        System.out.println(result);
    }
}