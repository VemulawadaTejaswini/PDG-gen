import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void fun(int a, int b, int h, int m) {

        double oneH = 2 * Math.PI / 12.0;
        double angleH = oneH * (h + m / 60.0);
        double oneM = 2 * Math.PI / 60.0;
        double angleM = oneM * m;

//        double angle = angleH - angleM;
        double angle = angleM - angleH;


        double ans = a * a + b * b - 2 * a * b * Math.cos(angle);
        System.out.println(Math.sqrt(ans));
    }



    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String[] ss=line.split(" ");
        int a = Integer.valueOf(ss[0]);
        int b = Integer.valueOf(ss[1]);
        int h = Integer.valueOf(ss[2]);
        int m = Integer.valueOf(ss[3]);
        fun(a, b, h, m);
    }



}
