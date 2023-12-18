import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String s = scanner.next();
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                List<Integer> temp = map.get(c);
                temp.add(i);
                map.replace(c, temp);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            }
        }

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = 1;
        }
        for(int i = 0; i < Q; i++){
            char index = scanner.next().charAt(0);
            char direction = scanner.next().charAt(0);
            if(map.containsKey(index)){
                List<Integer> move = map.get(index);
                for(int j = 0; j < move.size(); j++){
                    int val = move.get(j);
                    int nums = arr[val];
                    if(direction == 'L'){
                        if(val != 0) {
                            arr[val - 1] = arr[val - 1] + nums;
                        }
                    } else {
                        if(val != N - 1){
                            arr[val + 1] = arr[val + 1] + nums;
                        }
                    }
                    arr[val] = 0;
                }
            }
        }
        int ret = 0;
        for(int i = 0; i < N; i++){
            ret = arr[i] + ret;
        }
        System.out.println(ret);
    }
}
