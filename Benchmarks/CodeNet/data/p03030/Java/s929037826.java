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
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S[] = new String[N];
        int P[] = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
            P[i] = sc.nextInt();
        }
        ArrayList<City> c1=new ArrayList<City>();
        for(int i=0;i<N;i++)
        {
            c1.add(new City(S[i],P[i],i));
        }
        c1.sort(Comparator.comparing(City::getName).reversed().thenComparing(City::getPoint).reversed());
        for(int i=0;i<N;i++)
        {
            System.out.println(c1.get(i).number);//c1.get(i).name+" "+c1.get(i).point+" "+
        }
        //出力
        //System.err.println();//標準エラー出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        ///System.out.println(answer);
    }
}

class City
{
    String name;
    int point;
    int number;
    public City(String x,int y,int z)
    {
        name=x;
        point=y;
        number=z+1;
    }

    String getName()
    {
        return this.name;
    }

    int getPoint()
    {
        return this.point;
    }

    void outNum()
    {
        System.out.println(number);
    }
}