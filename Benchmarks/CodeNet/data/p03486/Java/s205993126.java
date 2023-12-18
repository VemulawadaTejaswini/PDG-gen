import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String s1 = sc.next();
        char[] c1 = s1.toCharArray();

        String s2 = sc.next();
        char[] c2 = s1.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(c1[0]<c2[s1.length()-1]) System.out.print("Yes");
        else System.out.print("No");
        
        System.out.println();
    }

}

