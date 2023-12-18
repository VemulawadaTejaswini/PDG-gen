import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        ArrayList<Number<Integer, Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int work = sc.nextInt();
            list.add(new Number<Integer, Integer>(num, work));

        }

        sc.close();

        list.sort(Comparator.comparing(Number::getNum));

        for (int i = 0; i < n; i++) {
            int work = list.get(i).getWork();
            if (work >= k) {
                System.out.println(list.get(i).getNum());
                return;
            } else {
                k -= work;
            }
        }

    }

    static class Number<num, work> {
        public int num;
        public int work;

        public Number(int num, int work) {
            this.num = num;
            this.work = work;
        }

        public int getNum() {
            return num;
        }

        public int getWork() {
            return work;
        }
    }
}