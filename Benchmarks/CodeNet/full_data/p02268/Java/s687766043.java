import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        
        n = sc.nextInt();
        int[] t = new int[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isContain(t[i], ary)) {
                res++;
            }
        }
        
        System.out.println(res);
    }
    
    public static boolean isContain(int num, int[] ary) {
        int head = 0;
        int tail = ary.length-1;
        int middle = (head + tail) / 2;
        while (middle != head) {
            int m = ary[middle];
            if (m == num) {
                return true;
            } else if (m < num) {
                head = middle;
            } else if (m > num) {
                tail = middle;
            }
            middle = (head + tail) / 2;
        }
        return ary[head] == num || ary[tail] == num;
    }
}