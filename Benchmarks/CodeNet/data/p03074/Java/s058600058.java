
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static class Feet implements Comparable<Feet> {
        int leftHands;
        int rightHands;
        int currentFeets;
        int label;
        public Feet() {
            leftHands = 0;
            rightHands = 0;
            currentFeets = 0;
            label = 0;
        }

        public Feet(int leftHands, int rightHands, int currentFeets, int label) {
            this.leftHands = leftHands;
            this.rightHands = rightHands;
            this.currentFeets = currentFeets;
            this.label = label;
        }

        @Override
        public int compareTo(Feet o) {
            long currentNum = leftHands + currentFeets + rightHands;
            long otherNum = o.leftHands + o.currentFeets + o.rightHands;
            if (currentNum > otherNum) {
                return 1;
            } else if (currentNum == otherNum) {
                return 0;
            } else {
                return -1;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Feet feet = (Feet) o;
            return leftHands == feet.leftHands &&
                    rightHands == feet.rightHands &&
                    currentFeets == feet.currentFeets &&
                    label == feet.label;
        }

        @Override
        public int hashCode() {
            return Objects.hash(leftHands, rightHands, currentFeets, label);
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String s = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        int last = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != last) {
                if (last == '1') {
                    numbers.add(count);
                } else {
                    numbers.add(-count);
                }
                count = 1;
                last = s.charAt(i);
            } else {
                ++count;
            }
        }
        if (last == '1') {
            numbers.add(count);
        } else {
            numbers.add(-count);
        }
        int ans = 0;
        int [] sum = new int[n];
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) > 0) {
                ans = Math.max(ans, numbers.get(i));
            }
            if (i == 0) {
                sum[0] = numbers.get(0) > 0 ? numbers.get(0) : -1 * numbers.get(0);
            } else {
                sum[i] = sum[i - 1] + (numbers.get(i) > 0 ? numbers.get(i) : -1 * numbers.get(i));

            }
//            System.out.println("sum: " + sum[i]);
        }
        if (k == 0) {
            System.out.println(ans);
            return;
        }
        int changes = 0;
        int len = 0;
        Queue<Integer> zeros = new LinkedBlockingQueue<>();
        for (int i = 0; i < numbers.size(); ++i) {
//            System.out.println("numbers: " + numbers.get(i));
            if (numbers.get(i) < 0) {
                len += numbers.get(i) * -1;
                ++changes;
               // System.out.println("len: "  +len + " changes: " + changes);
                if (changes > k) {
                    int start = zeros.poll();
                    len -= (-1 * numbers.get(start));
                    len -= (start - 1 >= 0) ? numbers.get(start - 1) : 0;
//                    System.out.println("start: " + start);
//                    System.out.println("sum: " + sum[start]);
//                    System.out.println("adjust len: " + len);
                    --changes;
                } else if (changes == k) {
                    ans = Math.max(ans, len);
//                    System.out.println("ans: " + ans);
                }
                zeros.add(i);
            } else {
                len += numbers.get(i);
                ans = Math.max(ans, len);
//                System.out.println("ans: " + ans);

            }
        }
        System.out.println(Math.max(ans, len));
    }
}
