import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for(int i = 0; i<N; i++) {
            if(sum%10 !=0) break;
            sum-= a[i];
        }
        System.out.println(sum);
    }
}