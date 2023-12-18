import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        ArrayList<ArrayList<Double>> plist = new ArrayList<ArrayList<Double>>();
        for (int Ni = 0; Ni < N; Ni++) {
            ArrayList<Double> l = new ArrayList<>();
            for (int Di = 0; Di < D; Di++) {
                l.add(sc.nextDouble());
            }
            plist.add(l);
        }

        int c = 0;
        for (ArrayList<Double> p1 : plist) {
            for (ArrayList<Double> p2 : plist) {
                if(p1==p2)continue;
                double d = 0;
                for(int i=0; i<D; i++) {
                     d +=Math.pow(p2.get(i)-p1.get(i),2);
                }
                d = Math.sqrt(d);
                if(d == (int)d) c++;
            }
            
        }
        System.out.println(c/2);
    }

}