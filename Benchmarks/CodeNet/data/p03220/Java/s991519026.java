import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int A = scanner.nextInt();

        int MAX = Integer.MAX_VALUE;

        int idx = -1;

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();

            if(tmp < MAX){
                idx = i + 1;
            }
        }

        System.out.println(idx);
    }
}
