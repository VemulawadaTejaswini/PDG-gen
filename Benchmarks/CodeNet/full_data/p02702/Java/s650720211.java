

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
//        preMode[i][j]表示i*10^j%2019
        ArrayList<ArrayList<Integer>> preMode = new ArrayList<>();
        preMode.add(new ArrayList<>());
//        preMode[i]的循环节
        int[] modeLoop = new int[10];
        for (int i = 1; i <= 9; i++) {
            boolean[] used = new boolean[2019];
            int mod = i;
            preMode.add(new ArrayList<>());
            while (!used[mod]) {
                preMode.get(i).add(mod);
                used[mod] = true;
                mod = mod * 10 % 2019;
                modeLoop[i] += 1;
            }
        }

        int[] modiToN = new int[str.length()];
        modiToN[chars.length - 1] = chars[chars.length - 1] - '0';
        for (int i = str.length() - 2; i >= 0; i--) {
            int numi = chars[i] - '0';
            int exp = (str.length() - i - 1) % modeLoop[numi];
            modiToN[i] = (preMode.get(numi).get(exp)+modiToN[i+1])%2019;
        }

        long[] count=new long[2019];
        for (int i:modiToN){
            count[i]+=1;
        }

        long result=0L;
        for (long i:count){
            result+=i*(i-1)/2;
        }
        result+=count[0];

        System.out.println(result);
    }
}
