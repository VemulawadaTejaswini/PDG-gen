import java.util.*;


public class Main {
    //    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
//        System.out.println("A: "+A+" B: "+B+" H: "+H+" M: "+M);
        int hour = H * 360 / 12 + M * 30 / 60;
        int min =  M * 360 / 60;
//        System.out.println("hour: "+hour+" min: "+min);
        double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(Math.abs(hour - min))));
        System.out.println(ans);

    }
}