import java.util.*;
import java.io.*;

public class Main {

    private static int solver(int a, int b, int t){
        return b * (t / a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solver(in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
