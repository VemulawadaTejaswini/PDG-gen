import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a,ans;
        Scanner scanner = new Scanner(System.in);
        
        a = scanner.nextInt();
        ans = a + a*a + a*a*a;
        
        System.out.println(ans);
    }
}
