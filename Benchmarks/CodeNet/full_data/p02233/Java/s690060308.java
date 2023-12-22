import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(fib(n));
        }
    }
    static int fib(int n) {
        int[] map = new int[n + 1];
        if      (n == 0) return 1;
        else if (n == 1) return 1;
        else if (map[n] != 0) return map[n];
        else { map[n] = fib(n - 1) + fib(n - 2); 
            return map[n];
        }
    }
}