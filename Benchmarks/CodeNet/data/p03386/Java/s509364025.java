import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = scan.nextInt();
        for(int i = a; i < Math.min((a + b) / 2, a + k); i++) System.out.println(i);
        for(int i = Math.max((a + b) / 2, b - k + 1); i <= b; i++) System.out.println(i);
        scan.close();
    }
}