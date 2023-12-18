import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();
        int[] a = new int[N];
        for(int i = 0; i<N-1; i++) {
            if(s.indexOf("AC",i) == i) a[i+1] = a[i] + 1;
            else a[i+1] = a[i];
        }
        for(int i = 0; i<Q; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(a[end-1]-a[start-1]);
        }
    }
}