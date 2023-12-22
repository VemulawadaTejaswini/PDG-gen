import java.util.*;

public class Main {

    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int array[] = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }

        out_put(array);

        int base, loc;
        for(int i = 1; i < N; i++){
            base = array[i];
            loc = i - 1;
            while(loc >= 0 && array[loc] > base){
                array[loc+1] = array[loc];
                loc--;
            }
            array[loc+1] = base;

            out_put(array);
        }

    }

    private static void out_put(int array[]){
        int i;
        for(i=0; i<array.length-1; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(array[i]);

        }
}

