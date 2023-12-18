import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int dams[] = new int[n];

        for(int i=0;i<n;i++) {
            dams[i] = sc.nextInt();
        }

        int t = 0;
        for(int i=0;i<n;i++) {
            if (i%2 == 1) {
                t-=dams[i];
            } else {
                t+=dams[i];
            }
        }

        StringBuilder builder = new StringBuilder();
        builder.append(t);
        for(int i=1;i<n;i++) {
            t = 2 * (dams[i-1] - (t/2));
            builder.append(" ").append(t);
        }
        
        // 出力
        System.out.println(builder.toString());
    }
}