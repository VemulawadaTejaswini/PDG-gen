import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    int[] hairetu = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
    void run() {
        //入力
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.println(hairetu[n-1]);
    }
}