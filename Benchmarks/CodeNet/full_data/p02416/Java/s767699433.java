import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        char arr[];
        int sum = 0;
        try {
            while (true) {
                data = br.readLine();
                arr = data.toCharArray();

                if (data.equals("0"))
                    return;

                for (int i = 0; i < arr.length; i++) {
                    sum += (int) arr[i] - 48;
                }
                System.out.println(sum);
                sum = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
