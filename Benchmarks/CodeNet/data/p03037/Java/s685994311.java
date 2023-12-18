//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[] a = new int[n];
//        int[][] bc = new int[2][m];
//        long sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(a);
//        for (int i = 0; i < m; i++) {
//            bc[0][i] = scanner.nextInt();
//            bc[1][i] = scanner.nextInt();
//        }
//        Comp comp = new Comp();
//        //2次元目のインデックス1番でソート
//        comp.set_index(1);
//        //Arraysクラスのsort()を実行する
//        Arrays.sort(bc, comp);
//        int k = 0;
//        for (int i = m-1; i >= 0; i--) {
//            if(a[k] >= bc[1][i]){
//                break;
//            }
//            for (int j = 0; j < bc[0][i]; j++) {
//                if (a[k] < bc[1][i]) {
//                    a[k++] = bc[1][i];
//                } else {
//                    break;
//                }
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            sum+=a[i];
//        }
//        System.out.println(sum);
//    }
//
//}
//
//class Comp implements Comparator {
//
//    int index = 0;
//
//    void set_index(int i) {
//        index = i;
//    }
//
//    @Override
//    public int compare(Object a, Object b) {
//        int[] int_a = (int[]) a;
//        int[] int_b = (int[]) b;
//        return (int_a[index] - int_b[index]);
//    }
//
//}
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            l.add(scanner.nextInt());
            r.add(scanner.nextInt());
        }

        if (Collections.min(r) >= Collections.max(l)) {
            System.out.println(Collections.min(r) - Collections.max(l) + 1);
        } else {
            System.out.println(0);
        }
    }
}