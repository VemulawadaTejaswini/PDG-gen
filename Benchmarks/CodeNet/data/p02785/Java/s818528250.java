import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        long Sum = 0;
        List<Long> list = new ArrayList<Long>();
        
        for(long i=0; i<N; i++){
            
            long HP = scanner.nextLong();
            list.add(HP);
            
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(long i=K; i<N; i++){
            Sum += list.get((int)i);
        }
        
        System.out.println(Sum);
    }
}
