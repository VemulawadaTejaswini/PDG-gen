import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int num = (int)(Math.pow(2, N) - 1);
        int[] A = {Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3])};
        int[] l = new int[N];
        for(int i = 0 ; i < N ; i++) {
            l[i] = Integer.parseInt(stdR.readLine());
        }
        Arrays.sort(l);
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= num ; i++) {
            for(int j = 1 ; j <= num ; j++) {
                for(int k = 1 ; k <= num ; k++) {
                    if((i & j) == 0 && (j & k) == 0 && (k & i) == 0) {
                        int turn = (Integer.bitCount(i) + Integer.bitCount(j) + Integer.bitCount(k) - 3) * 10;
                        turn += Math.abs(A[0] - returnnum(addzero(Integer.toBinaryString(i), N), l)) + Math.abs(A[1] - returnnum(addzero(Integer.toBinaryString(j), N), l)) + Math.abs(A[2] - returnnum(addzero(Integer.toBinaryString(k), N), l));
                        min = Math.min(min, turn);
                    }
                }
            }
        }
        System.out.println(min);
    }
    
    public static String addzero(String bin, int num) {
        for(int j = bin.length() ; j < num ; j++) {
            bin = "0" + bin;
        }
        return bin;
    }
    
    public static int returnnum(String str, int[] l) {
        int num = 0;
        for(int i = l.length - 1 ; i >= 0; i--) {
            if(str.charAt(i) == '1')num += l[l.length - i - 1];
        }
        return num;
    }
}
