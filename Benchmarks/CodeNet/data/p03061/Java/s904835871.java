import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] =sc.nextInt();
        }

        int maxgcd = -1;
        for (int j = 1; j < N ; j++) {
            int result = arr[0];
            for (int i = 1; i < N; i++) {
                if(i!=j){
                    result = gcd(arr[i], result);
                }
            }
            maxgcd = Math.max(maxgcd,result);
        }

        int result = arr[1];
        for (int i = 2; i < N; i++) {
                result = gcd(arr[i], result);
        }
        maxgcd = Math.max(maxgcd,result);



        System.out.println(maxgcd);

    }


    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


}