import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        String filename = "input.txt";
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        String tmps[] = bf.readLine().split(" ");
        int n = Integer.parseInt(tmps[0]);
        int k = Integer.parseInt(tmps[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(bf.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += a[j];
            }
            ans = Math.max(ans, sum);
        }
        bw.write(ans);
    }
}