import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] hasOkashi = new boolean[N];

        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                hasOkashi[sc.nextInt() - 1] = true;
            }
        }
        sc.close();
        
        int count = 0;
        for(int i=0;i<N; i++) {
            if(!hasOkashi[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
