package StandardDevitation;

public class Main {
    public static void main(String[] args) {
// 標準入力からデータを読み込む準備
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) { break; }
                int[] scores = new int[n];
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                }
                double average = 0, variance = 0;
// ... 平均値averageと，分散varianceを計算しよう ...
                int b=0;
                for(int i=0; i<scores.length;i++) {
                    s=s+scores[i]
                }
                double s, a;
                average=s/n;
                for(int i=0; i<scores.length;i++) {
                    a = Math.pow((scores[i] - average), 2);
                    b = a + b; 
                }
                variance=b/n;    
                System.out.println(Math.sqrt(variance));
                }
            }
        }
    }
}
