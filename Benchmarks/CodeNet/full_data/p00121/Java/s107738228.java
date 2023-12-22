import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<int[]> que = new ArrayDeque<int[]>();

            int[] state = new int[9];
            int[] temp = new int[9];

            for (int i = 0; i < 8; i++) {
                state[i] = sc.nextInt();
                if(state[i] == 0)state[8] = i;
            }
            map.put(key(state), 0);
            que.add(state.clone());
            if (key(state) != 76543210) {
                while (que.size() > 0) {
                    state = que.remove();
                    if (state[8] != 0 && state[8] != 4) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 1];
                        temp[temp[8] - 1] = 0;
                        temp[8] -= 1;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                        if (key(temp) == 76543210) break;
                    }
                    if (state[8] != 3 && state[8] != 7) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 1];
                        temp[temp[8] + 1] = 0;
                        temp[8] += 1;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                        if (key(temp) == 76543210) break;
                    }
                    if (state[8] < 4) {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] + 4];
                        temp[temp[8] + 4] = 0;
                        temp[8] += 4;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                        if (key(temp) == 76543210) break;
                    } else {
                        temp = state.clone();
                        temp[temp[8]] = temp[temp[8] - 4];
                        temp[temp[8] - 4] = 0;
                        temp[8] -= 4;
                        if (!map.containsKey(key(temp))) {
                            map.put(key(temp), map.get(key(state)) + 1);
                            que.add(temp.clone());
                        }
                        if (key(temp) == 76543210) break;
                    }
                }
            }
            System.out.println(map.get(76543210));
        }
    }


    public static int key(int[] a) {
        int j = 1, key = 0;
        for (int i = 0; i < 8; i++) {
            key += a[i] * j;
            j *= 10;
        }
        return key;
    }

}
