import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        for(i = N-1; i>=0; i=i-2) {
            System.out.print(a[i] + " ");
        }
        for(i = (i==-2)?1:0 ; i<N-1; i=i+2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}