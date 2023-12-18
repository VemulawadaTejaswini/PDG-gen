
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        long res = 0;
        Map<String, Integer> input_map = new HashMap();
        char[] input;
        String key;
        for(int i=0; i<N; i++) {
            input = in.next().toCharArray();
            Arrays.sort(input);
            key = String.valueOf(input);
            if(input_map.containsKey(key)){
                input_map.put(key, input_map.get(key)+1);
            } else {
                input_map.put(key, 1);
            }          
        }
        
        for(int val : input_map.values()) {
            if(val != 1) res += val*(val-1)/2;
        }        
        System.out.println(res);
        
    }
}