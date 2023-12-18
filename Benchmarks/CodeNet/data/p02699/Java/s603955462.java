import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //r(a, 0, "");
        Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int W = in.nextInt();
            if(W >= N) {
                System.out.println("unsafe");
            } else {
                System.out.println("safe");
            }

    }

}
