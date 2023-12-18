import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Top> list = new ArrayList<>();
        ArrayList<Integer> anss = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < n - 1 ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Top aInstance = new Top(a);
            Top bInstance = new Top(b);

            int aIndex = list.indexOf(aInstance);
            int bIndex = list.indexOf(bInstance);
            if (aIndex >= 0) {
                aInstance = list.get(aIndex);
            } else {
                list.add(aInstance);
            }
            aInstance.count++;

            if (bIndex >= 0) {
                bInstance = list.get(bIndex);
            } else {
                list.add(bInstance);
            }
            bInstance.count++;
            int ans = Math.max(aInstance.count, bInstance.count);
            if (ans > max) {
                max = ans;
            }
            anss.add(ans);
        }
        System.out.println(max);
        for (Integer value: anss
             ) {
            System.out.println(value);
        }
    }

    public static class Top {

        public int count = 0;
        public int value;

        public Top(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            return ((Top)obj).value == value;
        }
    }
}