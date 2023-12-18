import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int M = scan.nextInt();

        int C = scan.nextInt();

        int B[] = new int[M];

        int A[] = new int[M*N];

        for(int i = 0; i < M; i++){

            B[i] = scan.nextInt();

        }

        for(int cnt = 0; cnt < M*N; cnt++){

                A[cnt] = scan.nextInt();

            }


        scan.close();

        int ans = 0;

        int cnt = 0;

        for(int howCodes = 0; howCodes < N; howCodes++){

            int calcAns = 0;

            for(int i = 0; i < M; i++){

                calcAns = calcAns + A[cnt] * B[i];
                cnt++;

            }
            calcAns = calcAns + C;

            if(calcAns > 0){
                ans++;
            }
        }


        System.out.print(ans);

    }
}