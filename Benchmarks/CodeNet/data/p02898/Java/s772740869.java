import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] Z = new int[N];
        for(int n = 0; n < N; n++) {
            Z[n] = sc.nextInt();
        }
        int i = 0;
        
        for (int n = 0; n < N; n++) {
            if (Z[n] >= R) {
                i++;
            }
        }
        System.out.println(i);
    }
}