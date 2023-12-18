import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String[] wArr = new String[]{"Sunny", "Cloudy", "Rainy"};
        String s = sc.next();
        List<String> wList = Arrays.asList(wArr);
        int i = wList.indexOf(s);
        System.out.println(wArr[(i + 1) % 3]);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
