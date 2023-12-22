import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        long sum = 0;
        
        
        List<Long> list = new ArrayList<Long>(); 
        
        for(int i=0; i<N; i++){
            
            long A = scanner.nextLong();
            
            list.add(A);
            
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        for(int i=0; i<N-1; i++){
            
            sum += list.get(i);
            
        }
        
        System.out.println(sum);
    }
}
