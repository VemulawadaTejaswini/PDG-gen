import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("[\\s]+");
        int D = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int num = 1;
        for(int i = 0; i < D; i++) {
          num = num * 100;
        }
        int ans = 0;
        for(int i = 0; i < N; i++) {
          ans += num;
        }

        System.out.println(ans);
    }
}
