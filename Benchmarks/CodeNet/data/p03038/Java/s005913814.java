import javax.management.monitor.CounterMonitor;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Euclid e1=new Euclid();//ユークリッドの互除法
        //Compute c1=new Compute();//累積和，
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //int answer=0;
        double answer=0;
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M =sc.nextInt();
        double A[]=new double[N];
        int B[]=new int[M];
        double C[]=new double[M];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextDouble();
        }
        Arrays.sort(A);
        //System.err.println(Arrays.toString(A));
        for (int i=0;i<M;i++)
        {
            B[i]=sc.nextInt();
            C[i]=sc.nextDouble();
        }

        for(int j=0;j<M;j++)
        {
            while(count<B[j])
            {
                if(A[0]<C[j])
                {
                    A[0]=C[j];
                    count++;
                    Arrays.sort(A);
                    if(count==B[j])
                    {
                        count=0;
                        break;
                    }
                }else
                {
                    count=0;
                    break;
                }
                //System.err.println("hey! "+j);
            }
        }

        //System.err.println(Arrays.toString(A));

        for (int i=0;i<N;i++)
        {
            answer+=A[i];
        }
        //出力
        //System.err.println();//標準エラー出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        System.out.println(answer);
    }
}