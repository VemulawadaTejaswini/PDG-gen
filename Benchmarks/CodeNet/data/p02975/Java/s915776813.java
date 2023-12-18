import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] b = countNumbers(a);
        boolean ans = false;
        if(b.length == 1){
            if(b[0][0] == 0) ans = true;
        }else if(b.length == 2){
            if(b[0][0] == 0 && b[0][1] * 2 == b[1][1]) ans = true;
        }else if(b.length == 3){
            if(b[0][0] == (b[1][0] ^ b[2][0])
                    && b[1][0] == (b[2][0] ^ b[0][0])
                    && b[0][1] == b[1][1]
                    && b[1][1] == b[2][1]) ans = true;
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

    public static int[][] countNumbers(int[] array){
        int n = array.length;
        int[][] ret = new int[n][];
        int nums = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0 || array[i] != array[i-1]) ret[nums++] = new int[]{array[i], 0};
            ret[nums-1][1]++;
        }
        return Arrays.copyOf(ret, nums);
    }

}
