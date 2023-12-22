import java.util.Scanner;

public class Ahmed {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count=0;
        int n = read.nextInt();
        for (int i = 1; i <= n; i++)
        {
            int k = read.nextInt();
            if(i%2==1 && k%2==1)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}