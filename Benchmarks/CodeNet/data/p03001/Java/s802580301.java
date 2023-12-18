import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {

        int W;
        int H;
        int x;
        int y;

        try (Scanner sc = new Scanner(System.in)) {
            W = sc.nextInt();
            H = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

        }
        long a = W * H;
        float f = a /2;
        int j = 0;
        if(x*2 == W && y *2 == H){
            j = 1;
        }
        System.out.println(String.format("%.6f", f) + " "+j);
    }


}
