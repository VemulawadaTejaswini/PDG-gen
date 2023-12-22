public class Main {

    private static int n;

    public static void main(String[] args){
        n = 3;
        System.out.println(fibonacchi(n));
    }

    private static int fibonacchi(int n) {
        if (n == 0 || n == 1)
            return 1;

        return fibonacchi(n-1) + fibonacchi(n-2);
    }
}