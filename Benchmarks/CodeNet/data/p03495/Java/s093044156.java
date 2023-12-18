import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int cur = sc.nextInt();
            if(map.containsKey(cur)){
                map.put(cur, map.get(cur) + 1);
            }else{
                map.put(cur, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int diversity = list.size();
        int sum = 0;
        for(int i = 0; i < diversity - k; i++){
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}