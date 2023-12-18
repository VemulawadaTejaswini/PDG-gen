import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.*;
import java.util.stream.LongStream;

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

    /* 標準入力数値配列用 long */
    static long[] inputLongArr() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] longarray = new long[strarray.length];
        for (int i = 0; i < longarray.length; i++) {
            longarray[i] = Long.parseLong(strarray[i]);
        }
        return longarray;
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

    /*標準入力long*/
    static long inputLong() throws Exception {
        return Long.parseLong(br.readLine());
    }

    /*標準入力long*/
    static int inputInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }




    public static void main(String[] args) throws Exception {
        // write your code here
        int [] abc = inputval();
        int cnt = 0;
        while(abc[0] != abc[1] || abc[1] != abc[2] ){
            if (abc[0] % 2== abc[1]%2 && abc[1]%2 == abc[2]%2){
                Arrays.sort(abc);
                cnt += (Math.abs(abc[2]-abc[0]) + Math.abs(abc[2]-abc[1]))/2;
                break;
            }else if(abc[0] % 2 == abc[1]%2 && abc[1]%2 != abc[2]%2){
                abc[0] += 1;
                abc[1] += 1;
                cnt += 1;
            }else if(abc[0] % 2 == abc[2]%2 && abc[1]%2 != abc[2]%2){
                abc[0] += 1;
                abc[2] += 1;
                cnt += 1;
            }else if(abc[1] % 2 == abc[2]%2 && abc[1]%2 != abc[0]%2){
                abc[1] += 1;
                abc[2] += 1;
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }

}

