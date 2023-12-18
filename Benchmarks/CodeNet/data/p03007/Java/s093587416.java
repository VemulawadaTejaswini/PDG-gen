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
        int M=Integer.MIN_VALUE;
        List<Integer> ListX=new ArrayList<>();
        List<Integer> ListY=new ArrayList<>();
        //int x[];
        //int y[];


        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> A=new PriorityQueue<>();
        for (int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            A.add(a);
        }

        while (A.size()>2)
        {
            int x=A.poll();
            int y=A.poll();

            ListX.add(x);
            ListY.add(y);

            A.add(x-y);
        }

        //System.out.println(Arrays.toString(A.toArray()));

        while (A.size()>0)
        {
            if(A.size()==1)
            {
                M=A.poll();
            }else if(A.size()==2)
            {
                int y=A.poll();
                int x=A.poll();
                M=x-y;
                ListX.add(x);
                ListY.add(y);
            }
        }

        System.out.println(M);
        for(int i=0;i<ListX.size();i++)
        {
            System.out.println(ListX.get(i)+" "+ListY.get(i));
        }
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.out.println(answer);
    }
}