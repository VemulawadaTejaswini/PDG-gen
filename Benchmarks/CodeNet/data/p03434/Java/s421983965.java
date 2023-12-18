import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用 int
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    // 標準入力数値配列用 int
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        int n = Integer.parseInt(br.readLine().trim());
        Integer [] al = inputvalInteger();
        Arrays.sort(al,  Collections.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i=0; i<al.length;i++){
            if (i % 2 == 0){
                alice += al[i];
            }else{
                bob += al[i];
            }
        }
        System.out.println(alice-bob);
    }

}
