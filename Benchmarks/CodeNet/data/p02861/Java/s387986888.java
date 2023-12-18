import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<double[]> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double[] t = new double[2];
            t[0] = a;
            t[1] = b;
            list.add(t);
        }

        double ans = 0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                double[] tmp1 = list.get(i);
                double[] tmp2 = list.get(j);
                double tmp = Math.sqrt(Math.pow(tmp2[0]-tmp1[0],2)+Math.pow(tmp2[1]-tmp1[1],2));
                ans += tmp;
            }
        }

        ans *= 2*Math.pow(n, -1);

        System.out.println(ans);
    }
}