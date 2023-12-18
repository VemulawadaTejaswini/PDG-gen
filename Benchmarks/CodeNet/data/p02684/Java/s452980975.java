import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        Arrays.setAll(a, i -> sc.nextInt()-1);
        sc.close();
        int[] v = new int[n];
        Arrays.fill(v, -1);
        int num = 0;
        int m = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(v[m] == -1) {
            v[m] = num;
            list.add(m);
            num++;
            m = a[m];
        }
        int startNum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == m) {
                startNum = i;
                break;
            }
        }
        
        int result;
        if (k < (long)list.size()) {
            result = list.get((int)k);
        } else {
            int sur = (int)((k - (long)startNum) % (list.size() - startNum));
            result = list.get(startNum + sur) + 1;
        }
        
        System.out.println(result);
    }
}