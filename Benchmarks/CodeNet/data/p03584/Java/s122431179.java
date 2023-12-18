import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K_1 = sc.nextLong();
        String str = Long.toBinaryString(K_1);
        int len = str.length();
        long K_2 = (1L<<(len-1))-1;
        long K_3 = (1L<<(len-1));
        for (int i=len-2;i>=0;i--) {
            if (str.charAt(len-1-i)=='1') {
                K_3 += (1L<<i)-1;
                break;
            }
        }

        // System.out.println(Long.toBinaryString(K_1));
        // System.out.println(Long.toBinaryString(K_2));
        // System.out.println(Long.toBinaryString(K_3));
        long ans_1 = 0L;
        long ans_2 = 0L;
        long ans_3 = 0L;
        for (int i=0;i<N;i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            if ((A|K_1)==K_1) ans_1+=B;
            if ((A|K_2)==K_2) ans_2+=B;
            if ((A|K_3)==K_3) ans_3+=B;
        }
        // System.out.println("ans_1: "+ans_1);
        // System.out.println("ans_2: "+ans_2);
        // System.out.println("ans_3: "+ans_3);
        System.out.println(Math.max(Math.max(ans_1, ans_2), ans_3));
    }
}