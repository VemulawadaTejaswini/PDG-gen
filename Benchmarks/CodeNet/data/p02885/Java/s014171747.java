import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a-2*b,0));
    }


    private static int[] toArray(String text) {
        String[] vars = text.split("\\s+");
        int[] res = new int[vars.length];
        for (int i = 0; i < vars.length; i++) {
            res[i] = Integer.valueOf(vars[i]);
        }
        return res;
    }
}
