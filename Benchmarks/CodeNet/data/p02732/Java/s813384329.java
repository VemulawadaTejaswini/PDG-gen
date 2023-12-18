import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * TITLE : Banned K
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_d
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            list.add(number);
            if (!map.containsKey(number)) {
                map.put(number, 1);
            }
            else {
                map.put(number, map.get(number) + 1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int sub = list.get(i);
            int answer = 0;

            for (Integer key : map.keySet()) {
                int value = map.get(key);
                if (key.equals(sub)) {
                    value--;
                }
                for (int j = 1; j < value; j++) {
                    for (int k = j; k < value; k++) {
                        answer++;
                    }
                }
            }
            System.out.println(answer);

        }
        sc.close();
    }

}