import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == w / 2 && y == h / 2){
            System.out.println((w * h) / 2 + " " + 1);
        }else{
            System.out.println((w * h)/ 2 + " " + 0);
        }
    }
}
