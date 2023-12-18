import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D {

    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        BufferedReader br = null;
        String str = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        } catch (IOException e) {
            // IO 异常处理
            // 打印异常
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] s = str.split(" ");
        int sSize  = s.length;
        Set<String> strings = new HashSet<>(Arrays.asList(s));
        if (sSize != strings.size()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
