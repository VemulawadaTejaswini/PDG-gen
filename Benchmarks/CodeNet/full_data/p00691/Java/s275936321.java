import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int z = scan.nextInt();
            if (z == 0)
                break;
            long max = 0;
            for (int x = z - 1; x >0; x--) {
                for (int y = z - 1; y > 0; y--) {
                    long tmp =(int)Math.pow(x, 3) + (int)Math.pow(y, 3);
                    if (tmp <= Math.pow(z, 3)) {
                        max =tmp;
                        x=0;
                        break;
                    }
                }
            }
            System.out.println((int) Math.pow(z, 3) - max);
        }
    }
}