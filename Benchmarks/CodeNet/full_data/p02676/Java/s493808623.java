import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, i = 0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        String a;
        a = sc.next();
        if( k < a.length())
        {
            while ( k > 0)
            {
                System.out.print(a.charAt(i));
                i++;
                --k;
            }
            System.out.print("...");
        }
        else
        {
            System.out.print(a);
        }
    }
}
