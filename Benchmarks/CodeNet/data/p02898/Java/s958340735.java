import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read. nextInt();
        int k = read.nextInt();
        int count =0;
        for (int i=0;i<n;i++)
        {
            int h = read.nextInt();
            if (h>=k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
