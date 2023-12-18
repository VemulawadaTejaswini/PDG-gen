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
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<n; i++){
            String line = br.readLine().trim();
            if (map.get(line) == null){
                map.put(line,1);
            }else{
                map.replace(line,map.get(line)+1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            String line = br.readLine().trim();
            if (map.get(line) != null){
                map.replace(line,map.get(line)-1);
            }
        }
        int max = map.values().stream().max(Integer::compare).get();
        System.out.println(Math.max(max, 0));

    }

}

