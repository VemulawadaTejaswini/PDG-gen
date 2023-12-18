import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int count = 1;
        int right = 0;
        int left = 1;
        while(true) {
            int num = a[right];
            while(num != a[left]) {
                left++;
                if(left == n) count++;
                left %= n;
            }
            if(left == n - 1) break;
            right = (left + 1) % n;
            left = (right + 1) % n;
            if(left == 0) count++;
        }
        long num = k % count;
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        while(num != 0) {
            for(int i: a) {
              if(set.contains(i)) {
                  while(stack.peek() != i) {
                      int s = stack.pop();
                      set.remove(s);
                  }
                  stack.pop();
                  set.remove(i);
              } else {
                  stack.push(i);
                  set.add(i);
              }
            }
            num--;
        }
        for(int i: stack) {
          System.out.print(i + " ");
        }
    }
}
