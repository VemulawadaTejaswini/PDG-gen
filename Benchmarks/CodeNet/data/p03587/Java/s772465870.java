import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;
        String s1 = sc.next();
        char[] c = s1.toCharArray();
        
        if(c[0]=='1')cnt++;
        if(c[1]=='1')cnt++;
        if(c[2]=='1')cnt++;
        if(c[3]=='1')cnt++;
        if(c[4]=='1')cnt++;
        if(c[5]=='1')cnt++;

        System.out.print(cnt);
        System.out.println();
    }

}