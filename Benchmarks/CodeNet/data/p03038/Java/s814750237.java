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
        double dmax=Double.MIN_VALUE;
        double dmin=Double.MAX_VALUE;
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
        List<Double> kouho=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextDouble();
            kouho.add(A[i]);
        }
        for (int j=0;j<M;j++)
        {
            B[j]=sc.nextInt();
            C[j]=sc.nextDouble();
            for(int i=0;i<B[j];i++)
            {
                kouho.add(C[j]);
            }
        }
        Collections.sort(kouho,Collections.reverseOrder());
        for(int i=0;i<N;i++)
        {
            answer+=kouho.get(i);
        }
        //出力
        //System.err.println();//標準エラー出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        System.out.println(String.format("%.0f",answer));
    }
}