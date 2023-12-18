import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        // int k = 50;
        // while (k-- > 0){
        // Random random = new Random();
        // n = random.nextInt(500000);
        // System.out.println(n);
        
        List<Long> list = divisorList(n);
        list.sort(Comparator.reverseOrder());
        
        long ans = 0;
        for (int i = 0; i < list.size()/2; i++) {
            int j = list.size()-1 - i;
            if (list.get(i)-1 == list.get(j)) break;
            ans += list.get(i) - 1;
            // System.out.println(list.get(i)-1);
        }
        // System.out.println(list.size());
        // System.out.println(ans);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        // 21170-1
        // 10585-2
        // 4234-5
        // 2117-10
        // 730-29
        // 365-58
        // 290-73
        // 146-145
        
        // long ansb = 0;
        // for (long i = 1; i <= 500000; i++) {
        //     if (n / i == n % i) {
        //         ansb += i;
        //         System.out.println(i);
        //     }
        // }
        System.out.println(ans);
        
        // if (ans != ansb) {
        //     System.out.println(n + " " + ans + " " + ansb);
        // }
        // }
    }
    
    public static List<Long> divisorList(long n) {
        List<Long> res = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                
                long j = n / i;
                if (j != i) {
                    res.add(j);
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}
