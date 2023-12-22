import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int x =sc.nextInt();
            long ans1 =0;
            long ans2=0;
            for(long i=-1000;i<1000;i++)
            {
                long a =i*i*i*i*i;
                for(long j=i;j<1000;j++)
                {
                    long b = j*j*j*j*j;


                    if(b-a<1000000001&&(int)(b-a)==x)
                    {
                        ans1=i;
                        ans2=j;
                    }
                }

            }
            System.out.println(ans2 +" "+ans1);

    }


}