import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    }

    public static int fib(int n){
        if(n ==0 || n == 1){
            return 1;
        }else {
            int[] store ={1,1};
            for (int i = 2; i < n; i++) {
                int result = store[0]+store[1];
                store[0] = store[1];
                store[1] = result;
                i++;
            }
            return store[1];
        }
    }
}