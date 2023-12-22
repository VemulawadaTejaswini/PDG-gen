import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        long[] p = new long[1111];
        for(int i=0;i<1111;i++)p[i]=(long) Math.pow(i, 3);
        Scanner scan = new Scanner(System.in);
        while (true) {
            int z = scan.nextInt();
            if (z == 0)
                break;
            long max = 0;
            
            for (int x = z - 1; x >0; x--) {
                for (int y = z - 1; y > 0; y--) {
                    long tmp =p[x] + p[y];
                    if(tmp<max)break;
                    if (tmp <= p[z]) {
                        max =Math.max(tmp,max);
                        break;
                    }
                }
            }
            System.out.println(p[z]- max);
        }
    }
}