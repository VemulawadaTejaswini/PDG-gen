import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int N  = sc.nextInt();
        int r[][]  = new int[N][2];
        for (int i = 0; i< N;i++){
            r[i][0]  =sc.nextInt();
            r[i][1] = sc.nextInt();
        }

        int n_1 = factorial(N-1);
//        double distance[] = new double[n_1];
        int index = 0;
        double result = 0;
        for (int i = 0;i<N-1;i++){
            for(int j = i+1;j<N;j++){
//                distance[index] = Math.sqrt(Math.pow(r[i][0]-r[j][0],2)+Math.pow(r[i][1]-r[j][1],2))*n_1*2;
                result += Math.sqrt(Math.pow(r[i][0]-r[j][0],2)+Math.pow(r[i][1]-r[j][1],2))*n_1*2;
            }
        }
        System.out.println(result/factorial(N));


    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
