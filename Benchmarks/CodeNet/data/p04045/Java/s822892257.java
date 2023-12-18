import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        sc.nextLine();
        boolean D[] = new boolean[10];
        for (int i = 0; i < K; i++) {
            int index = Integer.parseInt(sc.next());
            D[index] = true;
        }
        int n = N;
        while (n <= 10*N) {
            int tmp = n;
            while (tmp > 0) {
                if (D[tmp%10])
                    break;
                tmp /= 10;
            }
            if (tmp==0)
                break;
            n++;
        }
        System.out.println(n);
        sc.close();
    }   
}