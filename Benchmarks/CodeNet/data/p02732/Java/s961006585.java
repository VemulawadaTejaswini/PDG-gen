import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int numCount[] = new int[length];
        int nums[] = new int[length];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(st.nextToken());
            numCount[val - 1] = numCount[val - 1] + 1;
            nums[i] = val;
        }
        int total = 0;
        for (int i = 0; i < length;i++) {

            int count = numCount[i];
            if (count!=0) {
                total += count * (count - 1) / 2;
            }
        }
        for (int i = 0; i < length;i++) {
            int val = nums[i];
            int count = numCount[val - 1];
            int temp = total - (count - 1) * count / 2 + (count - 2)*(count - 1)/2;
            System.out.println(temp);

        }
    }
}