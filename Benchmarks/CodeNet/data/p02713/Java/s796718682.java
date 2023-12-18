import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b)
    {
        while (a*b != 0){
            if (a > b){
                a %= b;
            }else{
                b %= a;
            }
        }
        return a + b;
    }
    public static void main(String[] args) {
        int K;
        Long sum = 0L;
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        for(int i = 1 ; i <= K ; i++)
        {
            for(int j = 1 ; j <= K ; j++)
            {
                for(int k = 1 ; k <= K ; k++)
                {
                    sum += gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(sum);
    }
}
