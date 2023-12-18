import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        long ans = 0;
        List<Long> list = new ArrayList<Long>();
        List<String> log = new ArrayList<String>();
        if (n % 2 == 0) {
            list.add(array[n-1] - array[0]);
            log.add(array[n-1] + " " + array[0]);
            for (int i = 1; i < n/2; i++) {
                list.add(array[i] - array[n-1-i]);
                log.add(array[i] + " " + array[n-1-i]);
            }
            
            long tmp = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                log.add(tmp + " " + list.get(i));
                tmp = tmp - list.get(i);
            }
            
            ans = tmp;
        } else {
            if (array[n/2] < 0) {
                list.add(array[n-1] - array[0]);
                log.add(array[n-1] + " " + array[0]);
                for (int i = 1; i < n/2; i++) {
                    list.add(array[i] - array[n-1-i]);
                    log.add(array[i] + " " + array[n-1-i]);
                }
                
                long tmp = list.get(0);
                for (int i = 1; i < list.size(); i++) {
                    log.add(tmp + " " + list.get(i));
                    tmp = tmp - list.get(i);
                }
                
                log.add(tmp + " " + array[n/2]);
                tmp = tmp - array[n/2];
                
                ans = tmp;
            } else {
                for (int i = 0; i < n/2; i++) {
                    list.add(array[i] - array[n-1-i]);
                    log.add(array[i] + " " + array[n-1-i]);
                }
                
                long tmp = array[n/2];
                for (int i = 0; i < list.size(); i++) {
                    log.add(tmp + " " + list.get(i));
                    tmp = tmp - list.get(i);
                }
                
                ans = tmp;
            }
        }
        
        System.out.println(ans);
        for (String s : log) {
            System.out.println(s);
        }
    }
}
