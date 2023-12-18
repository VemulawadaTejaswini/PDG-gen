import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Person[] arr = new Person[N];
        for (int i = 0; i < N; ++i) {
            int A = in.nextInt();
            arr[i] = new Person();
            for (int j = 0; j < A; ++j) {
                arr[i].add(in.nextInt(), in.nextInt());
            }
        }

        int ans = 0;
        for (int i = 1; i < (1<<N); ++i) {
            if (check(arr, i)) {
                ans = Math.max(ans, count(i));
            }
        }

        System.out.println(ans);
    }

    private static boolean check(Person[] arr, int m) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) if (((1<<i) & m) > 0) {
            for (Pair p: arr[i].li) {
                int x = p.f;
                int y = p.s;

                int value = ((1 << (x - 1)) & m) != 0 ? 1 : 0;
                if (value != y) return false;
            }
        }

        return true;
    }

    private static int count(int n) {
        int count = 0;
        while(n > 0) {
            count += n % 2;
            n >>= 1;
        }
        return count;
    }
}

class Person {
    public List<Pair> li;
    public Person() {
        li = new ArrayList<>();
    }

    public void add(int f, int s) {
        li.add(new Pair(f, s));
    }
}

class Pair {
    int f, s;
    public Pair(int f, int s) {
        this.f = f;
        this.s = s;
    }
}
