import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if(array[a] > array[b]){
                set.add(b);
            } else if (array[b] > array[a]){
                set.add(a);
            } else {
                set.add(a);
                set.add(b);
            }
        }

        System.out.println(n - set.size());

        sc.close();
    }

}