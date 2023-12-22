
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scanner.nextInt();
        int[] a = new int[n];
        for(int j=0;j<n;j++)
        {
            a[j] = scanner.nextInt();
        }
        int q= scanner.nextInt();
        for(int j=0;j<q;j++)
        {
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==b)
                {
                    a[i]=c;
                }
                sum+=a[i];
            }
            System.out.println(sum);
        }
	// write your code here
    }
}
