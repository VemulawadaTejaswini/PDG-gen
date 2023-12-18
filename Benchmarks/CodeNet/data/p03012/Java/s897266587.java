import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.management.monitor.CounterMonitor;
import java.lang.reflect.Array;
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
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        int answer = 0;
        //String answer="Yes";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W[] = new int[N];
        for(int i=0;i<N;i++)
        {
            W[i]=sc.nextInt();
        }

        for(int T=0;T<N;T++)
        {
            int s1=0;
            int s2=0;
            for(int i=0;i<N;i++)
            {
                if(i<=T)
                {
                    s1+=W[i];
                }else if(i>T)
                {
                    s2+=W[i];
                }
            }
            //System.err.println("s1="+s1);
            //System.err.println("s2="+s2);
            if(Math.abs(s1-s2)<min)
            {
                min=Math.abs(s1-s2);
            }
        }
        answer=min;
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.err.println(space);
        //System.err.println(sSwitch);
        System.out.println(answer);
    }
}