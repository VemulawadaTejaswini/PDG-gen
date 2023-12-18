import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long sum = 0 ;

        for(int i=K;i<=N;i++)
        {
            sum = sum +i*N -i*i +i+1;
            sum = sum%(1000000007);
        }

        System.out.print(sum+1);



    }
}
