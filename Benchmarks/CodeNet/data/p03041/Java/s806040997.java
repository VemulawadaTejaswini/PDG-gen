import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double prob=0;
        for (int i = 1; i <= N; i++) {
            prob+= (double) 1/N * Math.pow((double) 0.5 , log(K/i,2 )) ;
        }

        System.out.println(prob);
    }


    static int log(int x, int base)
    {
        return (int) Math.ceil (Math.log(x) / Math.log(base));
    }
}