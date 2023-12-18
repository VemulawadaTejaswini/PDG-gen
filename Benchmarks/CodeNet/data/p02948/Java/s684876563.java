
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int i = 0;

        PriorityQueue<Work> pq = null;

        while (true) {
            String inputText = scanner.nextLine();
            String[] inputTextArr = inputText.split(" ");

            if (i == 0) {
                n = Integer.parseInt(inputTextArr[0]);
                m = Integer.parseInt(inputTextArr[1]);

                pq = new PriorityQueue<>(n, new Comparator<Work>() {

                    @Override
                    public int compare(Work o1, Work o2) {
                        int priorityPay = o2.getPay().compareTo(o1.getPay());
                        if (priorityPay != 0) {
                            return priorityPay;
                        }
                        return o1.getDay().compareTo(o2.getDay());
                    }
                });

            } else {
                Integer a = Integer.valueOf(inputTextArr[0]);
                Integer b = Integer.valueOf(inputTextArr[1]);

                Work w = new Work(b, a);
                pq.add(w);
            }

            if (i >= n) {
                break;
            }

            i++;

        }
        scanner.close();

        int result = 0;
        int day = 1;

        for (; day <= m; day++) {
            Work w = pq.peek();
            if (w.getDay() <= day) {
                result = result + pq.poll().getPay();
            }
        }

        System.out.println(result);
    }

    static class Work {
        Integer pay;
        Integer day;

        Work(Integer pay, Integer day) {
            this.pay = pay;
            this.day = day;
        }

        /**
         * @return pay
         */
        public Integer getPay() {
            return pay;
        }

        /**
         * @param pay セットする pay
         */
        public void setPay(Integer pay) {
            this.pay = pay;
        }

        /**
         * @return day
         */
        public Integer getDay() {
            return day;
        }

        /**
         * @param day セットする day
         */
        public void setDay(Integer day) {
            this.day = day;
        }
    }

}