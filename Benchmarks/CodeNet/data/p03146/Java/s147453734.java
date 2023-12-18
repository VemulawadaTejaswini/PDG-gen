import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
	    Set<Integer> set = new HashSet();
	    int a = getInput();
        do {
            set.add(a);
            a = f(a);
        } while (!set.contains(a));
        System.out.println(set.size() + 1);
        return;
    }

    private static int f(int n)
    {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    private static int getInput()
    {
        int ret = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            ret = Integer.parseInt(br.readLine().trim());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return ret;
    }

}
