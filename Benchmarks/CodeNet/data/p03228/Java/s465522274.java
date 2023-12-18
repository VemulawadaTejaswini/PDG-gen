
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a= in.nextLong();
        long b= in.nextLong();
        long num_of_cookies = a+b;
        long k = in.nextLong();
        for(int i =0;i<k;i++)// 3
        {
            if(i%2==0)
            {
                b+=a/2;
                a/=2;
            }

                else {
                a += b / 2;
                b /= 2;
            }



        }
        System.out.println(a+" "+b);
    }
}
