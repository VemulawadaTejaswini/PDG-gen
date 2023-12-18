import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Long> list = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        long n = (long)scan.nextLong();
 
        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextLong());
        }
        long p = 0;
        long min = Collections.min(list);

        if(n % min == 0){
            p = n / min;
        } else {
            p = n / min + 1;
        }

        System.out.println(4 + p);
    }
}