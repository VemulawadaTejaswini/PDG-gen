import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

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

    // 標準入力数値配列用 integer ソート用
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
        int [] intarray = inputval();
        int n = intarray[0];
        int y = intarray[1];
        for (int i=0; i<=n; i++){
            int jMax = n-i;
            for (int j=0; j<=jMax; j++){
                int otoshidama = 10000*i+5000*j+1000*(n-i-j);
                    if (otoshidama > y){
                        break;
                    }else if (otoshidama == y){
                        System.out.println(String.valueOf(i)+" "+String.valueOf(j)+" "+String.valueOf(n-i-j));
                        return;
                    }
                }


        }
        System.out.println("-1 -1 -1");
    }

}

