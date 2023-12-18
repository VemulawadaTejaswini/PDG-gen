import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] x = new Integer[m];
        Index[] diff = new Index[m-1];
        for(int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        if(n >= m) {
            System.out.println(0);
            return;
        }
        Arrays.sort(x);
        for(int i = 0; i < m-1; i++) {
            diff[i] = new Index(i, x[i+1] - x[i]);
        }
        Arrays.sort(diff, (a, b) -> b.length - a.length);
        Index[] sorted = new Index[n-1];
        for(int i = 0; i < n-1; i++) {
            sorted[i] = diff[i];
        }
        Arrays.sort(sorted, (a, b) -> a.index - b.index);
        int count = 0;
        int current = 0;
        for(int i = 0; i < n-1; i++) {
            Index index = sorted[i];
            count += (x[index.index] - x[current]);
            current = index.index + 1;
        }
        count += (x[m-1] - x[current]);
        System.out.println(count);
    }
    private static class Index {
        int index;
        int length;
        Index(int index, int length) {
            this.index = index;
            this.length = length;
        }

    }
}

