import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Z = input.nextInt();
        int W = input.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            int b = input.nextInt();
            a[i] = b;
        }
        System.out.println(X(Z, W, a));
    }

    private static int X(int Z, int W, int[] a){
        if(a.length == 0){
            return Math.abs(Z-W);
        }
        int max = 0;
        for(int i = 0; i < a.length; i++){
            int c = Y(a[i], W, Arrays.copyOfRange(a, i + 1, a.length));
            if(c > max){
                max = c;
            }
        }
        return max;
    }

    private static int Y(int Z, int W, int[] a){
        if(a.length == 0){
            return Math.abs(Z-W);
        }
        int min = 1000000000;
        for(int i = 0; i < a.length; i++){
            int c = X(Z, a[i], Arrays.copyOfRange(a, i + 1, a.length));
            if(c < min){
                min = c;
            }
        }
        return min;
    }
}
    