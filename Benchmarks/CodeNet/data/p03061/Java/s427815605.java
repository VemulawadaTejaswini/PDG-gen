import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int[] c = new int[n-1];
        c[0] = gcd(a[0], a[1]);
        for(int i = 2; i < n; i++) {
            c[i-1] = gcd(c[i-2], a[i]);
        }
        int prev = c[c.length-1];
        int index = 0;
        for(int i = c.length-1; i >= 0; i--) {
            if(prev != c[i]) {
                index = i+1;
                break;
            }
        }
        a[index+1] = a[index];
        int num = a[0];
        for(int i = 1; i < n; i++) {
            num = gcd(num, a[i]);
        }
        System.out.println(num);
    }
    private static int gcd(int a, int b) {
        if(a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int r = a % b;
        while(r!=0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
