import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] l = new int[m][3];
        int[] x = new int[n];

        for(int i=0; i<m; i++){
            l[i][0] = sc.nextInt()-1;
            l[i][1] = sc.nextInt()-1;
            l[i][2] = sc.nextInt();
        }

        System.out.println("Yes");
    }
}

class Comp implements Comparator {

    int index = 0;

    public void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}