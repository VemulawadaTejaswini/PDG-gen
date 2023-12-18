import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Integer last = null;
        int lastIndex = 0;

        for (int i=0; i<5; i++) {
            int input = sc.nextInt();
            if (input % 10 == 0) list.add(input);
            else {
                if (last == null || input % 10 < last % 10) {
                    last = input;
                    lastIndex = i;
                }

                int next10 = input + 10 - (input % 10);
                list.add(next10);
            }
        }

        int sum = 0;
        if (last == 125) {
            for (int each: list) {
                sum += each;
            }
        } else {
            for (int i=0; i<5; i++) {
                if (i != lastIndex) {
                    sum += list.get(i);
                }
            }

            sum += last;
        }

        System.out.println(sum);
    }
}

class Pair<T1,T2> {
    private T1 left;
    private T2 right;

    public Pair(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return this.left;
    }

    public T2 getRight() {
        return this.right;
    }

    @Override
    public boolean equals(Object object) {
        Pair pair = (Pair)object;
        if (pair.getLeft().equals(this.getLeft())
                && pair.getRight().equals(this.getRight())) {
            return true;
        }
        return false;
    }
}
