import java.util.Scanner;
class Main {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = scan.nextInt();
        }
        if(ch(A, K, getD(A))){
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
    public static int getD(int[] A){
        int j =ju(A[0], A[1]);
        for(int i = 2; i < A.length; ++i){
            j = ju(j, A[i]);
        }
        return j;
    }

    public static int ju(int x, int y){
        int tmp;
        while ((tmp = x % y) != 0){
            x = y;
            y = tmp;
        }
        return y;
    }
    
    public static boolean ch(int[] A, int K, int j){
        int v, m;
        m = A[0];
        for(int i = 1; i < A.length; ++i){
            v = A[i];
            if(v > m){
                m = v;
            }
        }
        if((K % j) == 0 && K <= m){
            return true;
        } else {
            return false;
        }
    }
}
