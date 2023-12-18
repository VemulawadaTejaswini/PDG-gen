import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        sc.close();

        if(N == 1) {
            System.out.println("Yes");
        } else {
            for(int i = 0; i < N-1; i++){
                if ((H[i]-H[i+1]) > 1) {
                    System.out.println("No");
                    return;
                }
            }
            if(N > 2){
                for(int i = 0; i < N-2; i++){
                    if ((H[i] >H[i+1]) && (H[i+1] > H[i+2])){
                        System.out.println("No");
                        return;
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}