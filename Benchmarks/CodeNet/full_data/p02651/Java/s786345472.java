import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[][] array = new long[n][2];
            for (int i = 0; i < n; i++) {
                array[i][0] = sc.nextLong();
            }
            
            String str = sc.next();
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
                array[i][1] = (long)tmp;
            }
            
            if (array[n-1][1] == 1) {
                System.out.println(1);
                continue;
            }
            
            Set<Long> set1 = new HashSet<Long>();
            Set<Long> set0 = new HashSet<Long>();
            for (int i = 0; i < n; i++) {
                long owner = array[i][1];
                long num = array[i][0];
                if (owner == 1) {
                    List<Long> list = new ArrayList<Long>();
                    for (long s : set1) {
                        list.add(s ^ num);
                    }
                    set1.add(num);
                    for (long l : list) {
                        set1.add(l);
                    }
                } else {
                    List<Long> list = new ArrayList<Long>();
                    for (long s : set0) {
                        list.add(s ^ num);
                    }
                    set0.add(num);
                    for (long l : list) {
                        set0.add(l);
                    }
                }
            }
            
            boolean win1 = false;
            for (long s1 : set1) {
                if (!set0.contains(s1)) {
                    win1 = true;
                }
            }
            if (win1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
