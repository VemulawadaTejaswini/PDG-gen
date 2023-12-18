import java.util.*;

public class Main {

    static class Data implements Comparable<Data>{
        long q;
        long p;
        Data(long q, long p) {
            this.q = q;
            this.p = p;
        }

        long getValue() {
            return p * 200 / q;
        }

        @Override
        public int compareTo(Data o) {
            return Long.compare(this.getValue(), o.getValue());
        }

        @Override
        public String toString() {
            return "Data{" +
                    "q=" + q +
                    ", p=" + p +
                    '}';
        }
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long q = sc.nextLong() * 100;
        long h = sc.nextLong() * 100;
        long s = sc.nextLong() * 100;
        long d = sc.nextLong() * 100;

        List<Data> nums = new ArrayList<>();
        nums.add(new Data(25, q));
        nums.add(new Data(50, h));
        nums.add(new Data(100, s));
        nums.add(new Data(200, d));

        Collections.sort(nums);


        long n = sc.nextLong() * 100;
        long price = 0;

        Iterator<Data> iter = nums.iterator();
        while(iter.hasNext() && n > 0) {
            Data data = iter.next();
            long quantity = n / data.q;
            n %= data.q;
            price += quantity * data.p;
        }

        System.out.println(price / 100);

    }
}