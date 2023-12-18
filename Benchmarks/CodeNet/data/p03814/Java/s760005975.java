import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.indexOf('A');
        int z = s.lastIndexOf('Z');
        int result = z - a + 1;
        System.out.println(result);
        sc.close();
    }
}