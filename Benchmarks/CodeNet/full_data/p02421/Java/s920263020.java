import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            int taro = 0;
            int hanako = 0;

            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                String[] arr = in.readLine().split(" ");
                int cmp = arr[0].compareTo(arr[1]);
                if (cmp > 0) {
                    taro += 3;
                } else if (cmp == 0) {
                    taro++;
                    hanako++;
                } else {
                    hanako += 3;
                }
            }

            System.out.println(taro + " " + hanako);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

