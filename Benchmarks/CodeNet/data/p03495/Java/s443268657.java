

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int result = 0;
        int[] ball = inputval();
        int N = ball[0];
        int K = ball[1];
        int[] A = inputval();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++){
            if(!map.containsKey(A[i])) map.put(A[i],1);
            else map.put(A[i], map.get(A[i])+1);
        }
        //int minkey;
        //int mincount = Integer.MAX_VALUE;
        /*while(map.size() > K){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() < mincount){
                    minkey = entry.getValue();
                }
            }

            result++;

        }*/
        int c = 0;
        int i = 0;
        List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
                // 4. 昇順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        
        //map.entrySet().stream().sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()));
        for(Map.Entry<Integer, Integer> entry : list_entries){
            //System.out.println(entry.getKey()+" "+entry.getValue());
            i++;
            if(i > K) break;
            c += entry.getValue();
        }
        System.out.println(N-c);
    }
}