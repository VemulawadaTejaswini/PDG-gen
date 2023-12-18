import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int[][] r = new int[a][2];
        for(int x = 0; x < a; x++) {
            r[x][0] = Integer.parseInt(scanner.next());
            r[x][1] = Integer.parseInt(scanner.next());
        }
        Comp comp = new Comp();
        comp.set_index(1);
        Arrays.sort (r, comp);
        long count = 0;
        for(int x = 0;; x++){
            if(b < 0) {
                System.out.println("a" + x);
                break;
            }
            b = b - r[x][1];
            count +=  b > 0 ? (r[x][0] * r[x][1]) : r[x][0] * (r[x][1] - Math.abs(b));
        }

        System.out.println(count);
    }
}
class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare(Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}
