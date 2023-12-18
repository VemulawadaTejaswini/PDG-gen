import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String s1 = sc.next();
        char[] c1 = s1.toCharArray();

        if(c1[0]=='(') System.out.print("(");
        else System.out.print(")");
        System.out.print(s1);

        System.out.println();
    }

}