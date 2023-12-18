import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(f.readLine());
        int max = 0;
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        int value = 0;
        int toAdd = 1;
        while (value + toAdd <= l) {
            value += toAdd;
            lengths.add(toAdd);
            toAdd *= 2;
        }


        if (l - value > 0) {
            lengths.add(0, l - value);
        }

        int n = lengths.size() + 1;
        int m = lengths.size() * 2;
        System.out.println(n + " " + m);
        for (int i = 1; i < n; i++) {
            System.out.println(i + " " + (i + 1) + " " + 0);
            System.out.println(i + " " + (i + 1) + " " + lengths.get(i - 1));
        }

    }

    private static int powerOfTwo(int power) {
        int i = 1;
        for (int j = 0; j < power; j++) {
            i *= 2;
        }

        return i;
    }
}
