import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(bubbleSort(createArray(n)));
    }
    
    private static int[] createArray(int n) {
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) {
            ary[i] = scn.nextInt();
        }
        return ary;
    }
    
    private static int bubbleSort(int[] ary) {
        int cnt = 0;
        for(int i = 0; i < ary.length; i++) {
            for(int j = ary.length - 1; j > i; j--) {
                if(ary[j] < ary[j - 1]) {
                    ary[j] ^= ary[j - 1];
                    ary[j - 1] ^= ary[j];
                    ary[j] ^= ary[j - 1];
                    cnt++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int elm : ary) {
            sb.append(elm + " ");
        }
        System.out.println(sb.toString().trim());
        return cnt;
    }
}