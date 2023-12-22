import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        int m = in.nextInt();
        double hx = Math.sin((h+m/60.0)/12.0*2*Math.PI) * a;
        double hy = Math.cos((h+m/60.0)/12.0*2*Math.PI) * a;
        double mx = Math.sin(m/60.0*2*Math.PI) * b;
        double my = Math.cos(m/60.0*2*Math.PI) * b;
        double ans = Math.sqrt((hx-mx)*(hx-mx) + (hy-my)*(hy-my));
        DecimalFormat formatter = new DecimalFormat("0.000000000");
        System.out.println(formatter.format(ans));
    }
}
