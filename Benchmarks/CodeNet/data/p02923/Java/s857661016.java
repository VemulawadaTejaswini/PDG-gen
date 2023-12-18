import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                long h1 = sc.nextLong();
                int cnt = 0, max = 0, read = 0;
                do {
                        long h2 = sc.nextLong();
                        if(h1 >= h2) cnt++;
                        else cnt = 0;
                        if(max < cnt) max = cnt;
                        h1 = h2;
                        read++;
                } while(read < N - 1);
                sc.close();
                System.out.println(max);
        }
}
