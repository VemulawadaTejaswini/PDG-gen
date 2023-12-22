import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();

        double[] sh = {0, a};
        double[] lo = {0, b};

        double mit = 60 * h + m;
        double hourkaku = (360 - (360 * h / 12 + 30 * m / 60)) ;

        double mkaku = ((360 - 360 * m / 60) % 360) ;


        double shx = sh[0] * Math.cos(hourkaku * Math.PI/180) - sh[1] * Math.sin(hourkaku * Math.PI/180);
        double shy = sh[0] * Math.sin(hourkaku * Math.PI/180) + sh[1] * Math.cos(hourkaku * Math.PI/180);

        double lox = lo[0] * Math.cos(mkaku * Math.PI/180) - lo[1] * Math.sin(mkaku * Math.PI/180);
        double loy = lo[0] * Math.sin(mkaku * Math.PI/180) + lo[1] * Math.cos(mkaku * Math.PI/180);

//        System.out.println(hourkaku);
//        System.out.println(mkaku);
//        System.out.println(shx);
//        System.out.println(shy);
//        System.out.println(lox);
//        System.out.println(loy);

        double dis = Math.sqrt(Math.pow(shx - lox, 2) + Math.pow(shy-loy, 2));

        System.out.println(dis);


    }
}

