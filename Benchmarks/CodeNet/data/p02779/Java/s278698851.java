import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        String ans = "YES";
        Boolean[] lis = new Boolean[100000000];
        Arrays.fill(lis, false);
        for (int i = 0; i < N; i++) {
            if(lis[A[i]]){
                ans = "NO";
                break;
            }
            lis[A[i]] = true;
        }

        System.out.println(ans);

    }
}

