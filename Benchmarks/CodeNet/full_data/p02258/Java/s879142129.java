import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/2.
 */
public class Main {
    static int run(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int T = Integer.parseInt(scan.nextLine());
            int maxv = -1000000000;
            int min = -1;
            int pointer = -1;
            for (int i = 1; i <= T; i++) {
                pointer = Integer.parseInt(scan.nextLine());
                if (i == 1) {
                    min = pointer;
                } else {
                    maxv = (maxv > pointer - min) ? maxv : (pointer-min);
                    min = (min > pointer) ? pointer : min;
                }
            }
            System.out.println(maxv);
        }
        return 0;
    }
    public static void main(String[] args) {
        run(args);
    }
}