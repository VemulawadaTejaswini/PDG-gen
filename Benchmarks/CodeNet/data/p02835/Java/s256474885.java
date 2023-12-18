import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.Integer;

/**
 * Created by Messick on 2019/10/26.
 */
public class Main {
    public static void main(String[] args) {
        int []A = new int[4];
        Scanner in = new Scanner(System.in);
        A[1] = in.nextInt();
        A[2] = in.nextInt();
        A[3] = in.nextInt();
        if (A[1] + A[2] + A[3] >= 22) {
            System.out.println("bust");
        }else {
            System.out.println("win");
        }
    }
}
