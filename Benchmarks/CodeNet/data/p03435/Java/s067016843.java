import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

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

    // 標準入力数値リスト用 int
    static List<Integer> inputIntList() throws Exception {
        List<String> strList = Arrays.asList(br.readLine().trim().split(" "));
        List<Integer> intList = new ArrayList<Integer>();
        for (String elem : strList){
            intList.add(Integer.parseInt(elem));
        }
        return intList;
    }

    // 標準入力数値配列用 integer 降順ソート用
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
        int [] c1 = inputval();
        int [] c2 = inputval();
        int [] c3 = inputval();
        int c1Sum = Arrays.stream(c1).sum();
        int c2Sum = Arrays.stream(c2).sum();
        int c3Sum = Arrays.stream(c3).sum();
        int b1row = c1[0] + c2[0] + c3[0];
        int b2row = c1[1] + c2[1] + c3[1];
        int b3row = c1[2] + c2[2] + c3[2];

        boolean isAcorrect = Math.abs(c2Sum-c1Sum) %3 == 0 && Math.abs(c3Sum-c1Sum) %3 == 0 && Math.abs(c3Sum-c2Sum) %3 == 0;
        boolean isBcorrect = Math.abs(b2row-b1row) %3 == 0 && Math.abs(b3row-b1row) %3 == 0 && Math.abs(b3row-b2row) %3 == 0;
        if (isAcorrect && isBcorrect){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}

