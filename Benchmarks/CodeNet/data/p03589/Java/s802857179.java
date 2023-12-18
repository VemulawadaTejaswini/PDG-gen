import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int h = 1; h <= 3500 ; h++) {
            for (int n = 1; n <=  3500 ; n++) {
                for (int w = 1; w <=  3500 ; w++) {
                    long l = h * n * w * 4;
                    long r = h * n* N + n*w*N + w*h*N;
                    if(l == r){
                        System.out.println(h + " " + n + " " + w);
                        return;
                    }
                }
            }
        }

    }
}