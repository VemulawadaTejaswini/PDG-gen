import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] array;
    public static void main(String[] args) {
        read();
        solve();
    }

    static void read(){
        array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
        }
    }

    static void solve(){
        Arrays.sort(array);
        System.out.println(array[9]);
        System.out.println(array[8]);
        System.out.println(array[7]);
    }

}