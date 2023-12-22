import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        // String filename = "input.txt";
        // BufferedReader bf = new BufferedReader(new FileReader(filename));
        // BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        // String tmps[] = bf.readLine().split(" ");
        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if ((n | k) == 0)
                break;
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if(i>=n-k)break;
                int sum = 0;
                for (int j = i; j < k + i; j++) {
                    System.out.println(j);
                    sum += a[j];
                }

                ans = Math.max(ans, sum);
            }

            System.out.println(ans);
        }
    }
}