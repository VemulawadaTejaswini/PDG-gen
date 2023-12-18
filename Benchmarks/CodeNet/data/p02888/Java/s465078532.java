import java.util.*;
public class Main {
    public static void main(String[] args) {
        //data input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        //sort
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //search
        long ct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = list.get(i);
                    int b = list.get(j);
                    int c = list.get(k);
                    if (a < b + c && b < a + c && c < a + b) {
                        ct++;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(ct);

    }
}