import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] a = new int[100010];
        int[] b = new int[100010];
        for (int i = 0; i < N; i++)
        {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        scan.close();
        int times = 0;
        for (int i = 0; i < N; i++)
        {
            times += b[i];
            if (K <= times)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
