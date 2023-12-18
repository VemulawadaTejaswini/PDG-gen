import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long h = 1, n = 0, w = 0;
        
        for(int i = 0; i < 3500; i++) {
            for(int j = 1; j <= 3500; j++) {
                n = j;
                w = h * 2;
                if(4L*h*n*w == (N*n*w + N*h*w + N*h*n) || h > 0 || n > 0 || w > 0) {
                    System.out.println(h + " " + n + " " + w);
                    return;
                }
            }
            h *= N;
        }
    }
}
