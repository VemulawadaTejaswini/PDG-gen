import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean yes = Math.sqrt(a) +Math.sqrt(b) < Math.sqrt(c);
        
        System.out.println(yes ? "Yes" : "No");
    }

}
