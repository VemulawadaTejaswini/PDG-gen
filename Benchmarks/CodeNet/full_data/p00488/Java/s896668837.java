import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int p = a > b ? a > c ? a : c : b > c ? b : c;
        int j = d > e ? d : e;
        
        System.out.println(p + j - 50);
    }
}