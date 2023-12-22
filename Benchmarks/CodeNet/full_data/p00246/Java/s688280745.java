import java.util.Scanner;

public class Main {
    static int man[];
    static int ans;

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            man = new int[11];
            for (int i = 0; i < n; i++) {
                man[sc.nextInt()]++;
            }
            ans = 0;
            solve(10);
            System.out.println(ans);
        }
    }

    public static boolean solve(int n) {
        if (man[n] != 0) {
            man[n]--;
            ans++;
            return true;
        } else {
            for (int i = 1; i < n; i++) {
                if (man[i] != 0) {
                    man[i]--;
                    if (!solve(n - i))
                        man[i]++;
//                    else{
//                     System.out.println("n:"+n);
//                     System.out.println("i:"+i);
                    //}
                }
            }
        }
        return false;
    }
}