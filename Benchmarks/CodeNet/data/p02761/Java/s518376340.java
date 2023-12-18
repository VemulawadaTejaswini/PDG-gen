import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            int val = sc.nextInt();
//            if(map.containsKey(key)) {
//                int tmp = map.get(key);
//                if(tmp != val) {
//                    System.out.println(-1);
//                    return;
//                }
//            }
            map.put(key, val);
        }
        int sum = 0;
        for(Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            switch(key) {
            case 1:
                sum += val * 100;
                break;
            case 2:
                sum += val * 10;
                break;
            case 3 :
                sum += val;
            default:
                break;
            }
        }
        String ans = Integer.toString(sum);
        if(ans.equals("0")) {
            System.out.println(1);
        }else if(ans.length() == n) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}