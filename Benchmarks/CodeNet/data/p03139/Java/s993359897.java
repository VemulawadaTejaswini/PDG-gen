import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.min(a,b);
        int min = Math.max(0, a + b - n);

        System.out.println(max + " " + min);
        
    } 
}