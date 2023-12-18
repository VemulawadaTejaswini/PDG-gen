import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long n = sc.nextLong();
        long sol = solve(n);
        System.out.println(sol);
    }

    private static long solve(long n) {
        long racine = (int) (Math.sqrt(n) + 1);
        for(long i = racine; i >= 2; i--) {
            if(n %i == 0) return (i-1) + (n/i - 1);
        }
        return n - 1;
    }
}
