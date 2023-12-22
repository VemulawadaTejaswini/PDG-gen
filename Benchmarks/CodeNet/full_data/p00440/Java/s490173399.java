import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0 && k == 0) {
                break;
            }
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int start;
            if (arr[0] == 0) {
                start = 1;
            } else {
                start = 0;
            }
            boolean flag = false;
            int st = 0;
            int ed = 0;
            ArrayDeque<Unit> deq = new ArrayDeque<>();
            for (int i = start; i < k; i++) {
                if (flag) {
                    if (arr[i - 1] + 1 == arr[i]) {
                        ed = arr[i];
                    } else {
                        deq.add(new Unit(st, ed));
                        st = arr[i];
                        ed = arr[i];
                    }
                } else {
                    st = arr[i];
                    ed = arr[i];
                    flag = true;
                }
            }
            deq.add(new Unit(st, ed));
            int max = 0;
            while (deq.size() > 0) {
                Unit u = deq.poll();
                if (start == 0) {
                    max = Math.max(max, u.size);
                } else {
                    max = Math.max(max, u.size + 1);
                    if (deq.size() > 0 && deq.peek().start - u.end == 2) {
                        max = Math.max(max, u.size + deq.peek().size + 1);
                    }
                }
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Unit {
        int start;
        int end;
        int size;
        
        public Unit(int start, int end) {
            this.start = start;
            this.end = end;
            this.size = end - start + 1;
        }
    }
}
