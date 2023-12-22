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
            double[] points = new double[count];
            //longの配列に格納
            for(int i=0;i<count;i++) points[i] = Double.parseDouble(line[i]);
            //標準偏差計算
            double sample = 0;
            double ave_d = ave(points);
            double ans = 0;
            for(int i=0;i<points.length;i++)
                sample += (Math.pow((points[i] - ave_d),2));
            ans = Math.sqrt(sample / points.length);
            System.out.println(nf.format(ans));
        }
    }
    static double sum(double[] tag) {
        double sum = 0;
        for(int i=0;i<tag.length;i++)
            sum += tag[i];
        return sum;
    }
    static double ave(double[] tag) {
        return sum(tag) / tag.length;
    }
}