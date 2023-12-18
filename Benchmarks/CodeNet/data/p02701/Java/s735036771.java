import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;

public class Main {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    public static String next() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return in.sval;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<String> set = new HashSet<String>();
        int n = nextInt();
        while (n-- > 0) {
            set.add(next());
        }
        System.out.println(set.size());
    }

}
