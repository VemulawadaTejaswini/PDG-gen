import javax.management.monitor.CounterMonitor;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer=0;
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //
        Output o1=new Output();
        Euclid e1=new Euclid();
        Compute c1=new Compute();

        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


        //処理
        answer=n-k+1;
        //出力
        System.out.println(answer);
    }
}