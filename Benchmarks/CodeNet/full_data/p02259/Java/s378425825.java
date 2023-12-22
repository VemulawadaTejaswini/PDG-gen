import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int[] test;
        test = new int[N];

        int tmp;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            test[i] = sc.nextInt();
        }

        for (int s = N-1; s>0; s--) {
            for (int j = N-1; j >0; j--) {
                if (test[j] < test[j-1]) {
                    tmp = test[j];
                    test[j] = test[j-1];
                    test[j-1] = tmp;
                    cnt++;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            System.out.print(test[j]);
            if(j<N-1){
                System.out.print(" ");
            }
            if(j==N-1){
                System.out.println("");
            }
        }
        System.out.println(cnt);

    }
}
