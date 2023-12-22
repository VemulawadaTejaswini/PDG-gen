import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> sc.nextInt());
        sc.close();
        
        long all = n;
        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < n; i++) {
            boolean ok = false;
            for (int j = 0; j < list.size(); j++) {
                if (a[i] % list.get(j) == 0) {
                    ok = true;
                    break;
                }
            }
            if (ok) {
                all--;
            } else {
                list.add(a[i]);
            }
        }
        System.out.println(all);
        
    }
}

