import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(8);
        nf.setGroupingUsed(false);
        while(true) {
            int count = Integer.parseInt(br.readLine());
            if(count == 0)break;
            String[] line = br.readLine().split(" ");
            long[] sum = new long[count];
            //longの配列に格納
            for(int i=0;i<count;i++)
                sum[i] = Integer.parseInt(line[i]);
            //標準偏差計算
            double sample = 0;
            double ave_d = ave(sum);
            double ans = 0;
            for(int i=0;i<sum.length;i++)
                sample += (Math.pow((sum[i] - ave_d),2));
            ans = Math.sqrt(sample / sum.length);
            System.out.println(nf.format(ans));
        }
    }
    static long sum(long[] tag) {
        long sum = 0;
        for(int i=0;i<tag.length;i++)
            sum += tag[i];
        return sum;
    }
    static double ave(long[] tag) {
        return sum(tag) / tag.length;
    }
}