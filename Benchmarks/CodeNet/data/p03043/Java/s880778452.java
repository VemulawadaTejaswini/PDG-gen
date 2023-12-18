import javax.management.monitor.CounterMonitor;
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
        int K=sc.nextInt();

        int k=1;
        int c=0;
        while (k<K)
        {
            k=k*2;
            c++;
        }
        //System.err.println("k "+k);
        System.err.println("c "+c);
        //System.err.println(N);
        double dd=(double)1/2;
        double aa=(double)1/N;
        double bb=(double)Math.pow(dd,c);
        //System.err.println("aa "+aa);
        //System.err.println("bb "+bb);
        double base=aa*bb;
        //double base=(1/N)*Math.pow((1/2),c);
        //System.err.println("base "+base);
        double e=base;
        answer+=base;
        int yy=2;
        c--;
        while(yy<=N && c>0)
        {
            //System.err.println(yy);
            //System.err.println(c);
            e=(double)e*2;
            //System.err.println(e);
            answer+=e;
            c--;
            yy++;
            //System.err.println("after yy "+yy);
            //System.err.println("after c "+c);
        }
        /*
        for(int i=c-1;i>1;i--)
        {
            e=(double)e*2;
            //System.err.println(e);
            answer+=e;
        }
        */
        //出力
        //System.err.println();//標準エラー出力
        System.out.println(answer);
    }
}