import java.util.ArrayList;
import java.util.Scanner;

class Frog_2
{
    public static void main(String argp[])
    {
        Scanner in=new Scanner(System.in);
        int N,K;
        N=in.nextInt();
        K=in.nextInt();
        ArrayList<Integer> H=new ArrayList<>();
        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            dp.add(1000000);
            H.add(in.nextInt());
        }
        dp.set(0,0);
        for(int i=0;i<N;i++)
        {
            for(int j=1;j<=K;j++)
            {
                if(j+i<N)
                {
                    dp.set(i+j,Math.min(dp.get(i+j),dp.get(i)+Math.abs(H.get(i)-H.get(i+j))));
                }
            }
        }
        System.out.println(dp.get(N-1));
    }
}
