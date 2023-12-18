import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int m = key.nextInt();
        int arr[] = new int[n];
        int sum =0;
        for(int i = 0; i<n;i++)
        {
            arr[i] = key.nextInt();
            sum = sum + arr[i];
        }
        double mar = (sum/(m*4.0));
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] >= mar)
            {
                count ++;
            }
        }
        if(count >= m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

//4 1 
//5 4 2 1 
//total vote count = 12 , min popular item = 12/8 = 3/2 = 1.