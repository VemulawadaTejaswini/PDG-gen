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
        //int answer = 0;
        String answer="Yes";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S=sc.next();

        String s[]=new String[N];
        boolean sSwitch=false;
        if(C>D)
        {
            sSwitch=true;
            //System.err.println("C>D");
        }

        boolean space=false;

        for(int i=0;i<N;i++)
        {
            s[i] = S.substring(i, i + 1);
        }

        for(int i=0;i<N;i++)
        {
            if(i>0)
            {
                if(s[i-1].equals("#") && s[i].equals("#"))
                {
                    System.out.println("No");
                    System.exit(0);
                }
            }

            if(i==C || i==D)
            {
                if(s[i-1].equals("#") && s[i+1].equals("#"))
                {
                    System.out.println("No");
                    System.exit(0);
                }
            }

            if(i>B-1 && i<N-2 && space==false && sSwitch==true)
            {
                if(s[i-1].equals(".") && s[i].equals(".") && s[i+1].equals("."))
                {
                    space=true;
                }
            }

            if(i==D-1 && sSwitch==true && space==false)
            {
                if(i+1==C-1 && s[i-1].equals("#"))
                {
                    answer="No";
                    //System.err.println("ccs");
                }
                //System.err.println(i);
            }
        }

        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        //System.err.println(space);
        //System.err.println(sSwitch);
        System.out.println(answer);
    }
}