//package atcoderdp;

import java.util.*;

class Main {
    static HashMap<String, Integer> states;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
        states = new HashMap<>();
        int res = Math.max(Math.max(find(a, n,  0, 0), find(a, n,  0, 1)), find(a, n,  0, 2));
        System.out.println(res);
    }

    public static int find(int a[][], int n,  int start, int index) {
        String state = index + " " + start;
        if (states.containsKey(state))
            return states.get(state);
        if (start == n-1) {
            //System.out.println(a[start][index]);
            return a[start][index];
        }

        else {
            int val1 = find(a, n,  start + 1, (index + 1) % 3);
            int val2 = find(a, n,  start + 1, (index + 2) % 3);
            // System.out.println(val1+" "+val2);
            int val = Math.max(val1 + a[start][index], val2 + a[start][index]);
            states.put(state, val);
            return val;
        }
    }
}
/*150 150
90 90
150 90
150 150
90 150
150 150
150 150
150 150
150 150
150*/
/*150 150
90 90
150 90
120 120
150 150
120 150
150 150
150 150
180 180
150 180
120 120
150 150
120 150
180 150
150 150
180 180
150 180
210 210
150 150
210 150
180 210
210*/