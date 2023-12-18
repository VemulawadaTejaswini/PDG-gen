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
        int [] nk = inputval();
        int n = nk[0];
        int k = nk[1];
        int [] al = inputval();
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i<n; i++){
            int a = al[i];
            if (map.containsKey(a)){
                map.replace(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int j = 0; j < list.size()-k; j++){
            ans += list.get(j);
        }
        System.out.println(ans);

    }

}

