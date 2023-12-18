import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> ary = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for (Integer i = 0; i < n; i++) {
            ary.put(i, 0);
        }

        for (Integer i = 0; i < n; i++) {
            Integer val = sc.nextInt();
            Integer count = ary.get(val);
            ary.put(val, count + 1);
        }

        Integer i = (n % 2 == 0) ? 1 : 2;
        Long sum = 1L;
        for (; i < n; i += 2) {
            Integer val = ary.get(i);
            if (val != 2) {
                System.out.println("0");
                return;
            }

            sum *= 2;
            sum %= 1000000000 + 7;
        }
        System.out.println(sum);
    }
}