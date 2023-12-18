import java.util.Scanner;



public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int T[] = new int[N];
        for(int i = 0; i< N;i++) {
            T[i] = scan.nextInt();
            sum += T[i];
        }
        int M = scan.nextInt();
        int P[] = new int [M];
        int X[] = new int [M];
        for (int i = 0; i < M; i++){
            P[i] = scan.nextInt();
            X[i] = scan.nextInt();
        }

        for(int i = 0; i < M; i++){
            int be = T[P[i]];
            int s = sum;
            sum -= T[P[i]-1];
            sum += X[i];
            System.out.println(sum);
            sum = s;
        }

    }


}
