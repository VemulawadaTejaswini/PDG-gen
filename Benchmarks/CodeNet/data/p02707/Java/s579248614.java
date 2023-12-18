import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int subordinate_count[] = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            subordinate_count[sc.nextInt()]++;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(subordinate_count[i]);
        }
    }
}
