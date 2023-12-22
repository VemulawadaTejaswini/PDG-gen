import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= m; i++) {
            int total = 0;
            int d = i;
            while(d > 0) {
                total += d % 10;
                d = d / 10;
            }
            
            int zyo = 1;
            int g = total + a;
            for (int o = 0; o < n; o++) {
                zyo *= g;
            }
            
            if (zyo == i) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}

