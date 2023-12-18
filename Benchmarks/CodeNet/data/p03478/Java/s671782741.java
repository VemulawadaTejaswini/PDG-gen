import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        int N,A,B;
        Scanner input;
        input = new Scanner(System.in);
        N = input.nextInt();
        A = input.nextInt();
        B = input.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++){
          String tmp = String.valueOf(i);
          String[] sa = tmp.split("");
          int[] ia = Stream.of(sa).mapToInt(Integer::parseInt).toArray();
          int sum = java.util.Arrays.stream(ia).sum();
          if (A <= sum && sum <= B){
            ans += i;
          }
        }
        System.out.println(ans);
    }
}