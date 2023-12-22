
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while (i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static HashMap<String, Long> costMap = new HashMap<>();
    private static long calculate(String a, List<String> list){
        if(a.length() == 0 || isPalindrome(a)) return 0;
        for(int i = 0; i < list.size(); i++){
            int match = 0;
            int index = 0;
            for(index = 0; index < Math.min(a.length(), list.get(i).length()); index++){
                if(a.charAt(a.length() - 1 - index) == list.get(i).charAt(index)){
                    match++;
                }else {
                    break;
                }
            }
            if(match == 0) continue;
            long v1 = calculate2(a.substring(0, a.length() - index), list);
            long v2 = calculate(list.get(i).substring(index), list);
            if(v1 == Long.MAX_VALUE || v2 == Long.MAX_VALUE) return Long.MAX_VALUE;
            return v1 + v2 + costMap.get(list.get(i));
        }
        return Long.MAX_VALUE;
    }

    private static long calculate2(String a, List<String> list){
        if(a.length() == 0 || isPalindrome(a)) return 0;
        for(int i = 0; i < list.size(); i++){
            int match = 0;
            int index = 0;
            for(index = 0; index < Math.min(a.length(), list.get(i).length()); index++){
                if(list.get(i).charAt(list.get(i).length() - 1 - index) == a.charAt(index)){
                    match++;
                }else {
                    break;
                }
            }
            if(match == 0) continue;
            long v1 = calculate(list.get(i).substring(0, list.get(i).length() - index), list);
            long v2 = calculate2(a.substring(index), list);
            if(v1 == Long.MAX_VALUE || v2 == Long.MAX_VALUE) return Long.MAX_VALUE;
            return v1 + v2 + costMap.get(list.get(i));
        }
        return Long.MAX_VALUE;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // code goes here
        int n = nextInt(br);
        String[] strings = new String[n];
        int[] costs = new int[n];
        long cost = Long.MAX_VALUE;
        List<String> nonPalindromes = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            strings[i] = st.nextToken();
            costs[i] = Integer.parseInt(st.nextToken());
            //StringBuilder s = new StringBuilder(strings[i]);
            if(isPalindrome(strings[i]))
                cost = Math.min(cost, costs[i]);
            else {
                nonPalindromes.add(strings[i]);
                //nonPalindromes.add(s.reverse().toString());
            }
            if(costMap.containsKey(strings[i])){
                costMap.put(strings[i], (long) Math.min(costs[i], costMap.get(strings[i])));
            }else {
                costMap.put(strings[i], (long) costs[i]);
            }
            //costMap.put(s.reverse().toString(), (long) costs[i]);
        }


        for(int i = 0; i < nonPalindromes.size(); i++){
            long val = calculate(nonPalindromes.get(i), nonPalindromes);
            //StringBuilder s = new StringBuilder(nonPalindromes.get(i));
            //s = s.reverse();
            long v2 = calculate2(nonPalindromes.get(i), nonPalindromes);
            if(val == Long.MAX_VALUE && v2 == Long.MAX_VALUE) continue;
            cost = Math.min(cost, Math.min(v2, val) + costMap.get(nonPalindromes.get(i)));
        }

        if(cost == Long.MAX_VALUE){
            cost = -1;
        }
        sb.append(cost);

        System.out.print(sb.toString());
    }

    private static int nextInt(BufferedReader br) throws IOException{
        return Integer.parseInt(br.readLine());
    }

    private static int[] nextIntArray(BufferedReader br, int n) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}

