import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        ArrayList<Double> q = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            q.add(v[i]);
        }
        //System.out.println("---");
        while(q.size() > 1) {
            double val = (q.remove(0) + q.remove(0)) / 2;
            //System.out.println(val);
            q.add(val);
            Collections.sort(q);
        }
        System.out.println(q.get(0));
    }
}