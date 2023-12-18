import java.util.*;
class Main {
    static int[] a;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        int b = a[n-1]/2;
        int pare = getNearB(b);
        System.out.println(a[n-1] +" " + pare);
    }
    public static int getNearB(int b) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<n-1; i++) {
            if(min>= Math.abs(b-a[i])) {
                min = Math.abs(b-a[i]);
                index = i;
            }
        }
        return a[index];
    }
}