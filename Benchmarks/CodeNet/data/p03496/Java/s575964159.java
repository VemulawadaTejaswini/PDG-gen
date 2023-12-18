import java.util.*;

public class Main {

    public static int maxa (int[] array) {
        int max_val = array[0];
        for (int i = 1; i < array.length; i++) {
            max_val = Math.max(max_val, array[i]);
        }

        return max_val;
    }

    public static int mina (int[] array) {
        int min_val = array[0];
        for (int i = 1; i < array.length; i++) {
            min_val = Math.min(min_val, array[i]);
        }

        return min_val;
    }

    public static int linearSearch (int key, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int flag;
        if (a[0] >= 0) {
            flag = 0;
        } else {
            flag = 1;
        }
        for (int i = 1; i < a.length; i++) {
            if ((a[i] < 0 && flag == 0) || (a[i] > 0 && flag == 1)) {
                flag = 2;
                break;
            }
        }

        switch (flag) {
            case 0:
                System.out.println(n - 1);
                for (int i = 0; i < a.length - 1; i++) {
                    a[i + 1] += a[i];
                    System.out.println((i + 1) + " " + (i + 2));
                }
                break;
            case 1:
                System.out.println(n - 1);
                for (int i = a.length - 1; i > 0; i--) {
                    a[i - 1] += a[i];
                    System.out.println((i+1) + " " + i);
                }
                break;
            case 2:
                boolean add_f = true;
                int max = maxa(a);
                int min = mina(a);
                int max_index = linearSearch(max, a) + 1;
                int min_index = linearSearch(min, a) + 1;

                if (Math.abs(max) < Math.abs(min)) {
                    add_f = false;
                }

                System.out.println(2 * n - 1);

                if (add_f == true) {
                    for (int i = 0; i < a.length; i++) {
                        a[i] += max;
                        System.out.println((i + 1) + " " + max_index);
                    }
                    for (int i = 0; i < a.length - 1; i++) {
                        a[i + 1] += a[i];
                        System.out.println((i + 1) + " " + (i + 2));
                    }
                } else {
                    for (int i = 0; i < a.length; i++) {
                        a[i] += min;
                        System.out.println((i + 1) + " " + min_index);
                    }
                    for (int i = a.length - 1; i > 0; i--) {
                        a[i - 1] += a[i];
                        System.out.println((i+1) + " " + i);
                    }
                }
        }
    }
}
