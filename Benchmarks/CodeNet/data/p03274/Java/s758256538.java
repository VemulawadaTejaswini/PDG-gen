import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        List<Integer> left= new ArrayList<>();
        List<Integer> right= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a < 0) {
                left.add(Math.abs(a));
            } else if (a > 0) {
                right.add(a);
            } else {
                k = k - 1;
            }
        }
        Collections.sort(left);
        Collections.sort(right);
        
        if (k <= 0) {
            System.out.println(0);
            return;
        }
        
        int time = 0;
        int current = 0;
        for (int i = 0; i < k; i++) {
            int next = getMin(left, right, current);
            if (current < 0 && next < 0) {
                time = time + Math.abs(next) - Math.abs(current);
            } else if (current >= 0 && next < 0) {
                time = time + Math.abs(next);
            } else if (current >= 0 && next > 0) {
                time = time + next - current;
            } else {
                time = time + next;
            }
            current = next;
        }
        System.out.println(time);
    }

    private int getMin(List<Integer> left, List<Integer> right, int current) {
        if (left.size() == 0) {
            return getMinValueAndRemove(right);
        }
        if (right.size() == 0) {
            return 0 - getMinValueAndRemove(left);
        }
        int leftValue = left.get(0);
        int rightValue = right.get(0);
        if (current < 0) {
            leftValue = leftValue - Math.abs(current);
            rightValue = rightValue + Math.abs(current);
        } else {
            leftValue = leftValue + current;
            rightValue = rightValue - current;
        }
        if (leftValue < rightValue) {
            return 0 - getMinValueAndRemove(left);
        }
        return getMinValueAndRemove(right);
    }
    
    private int getMinValueAndRemove(List<Integer> list) {
        int min = list.get(0);
        list.remove(0);
        return min;
    }
}