import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int p = Integer.parseInt(arr[1]);
        System.out.println((3 * a + p) / 2);
    }
}
