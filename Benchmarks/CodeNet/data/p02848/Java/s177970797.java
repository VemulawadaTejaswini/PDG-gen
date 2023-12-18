import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.print(s.substring(n, s.length()));
        System.out.println(s.substring(0,n));
    }
}