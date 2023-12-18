import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i = 0; i<N; i++) {
            if(A[i] % A[0] != 0) break;
            if(i == N-1) {
                System.out.println(A[0]);
                return;
            }
        }

        int r = A[0];

        for(int i = 1; i<N; i++){
            int a = A[i];
            int b = r;
            if(b==1) {
                System.out.println(1);
                return;
            }
            r = a % b;
            while(r!=0){
                a = b;
                b = r;
                if(b==1) {
                    System.out.println(1);
                    return;
                }
                r = a % b;
            }
        }
        System.out.println(r);
    }
}