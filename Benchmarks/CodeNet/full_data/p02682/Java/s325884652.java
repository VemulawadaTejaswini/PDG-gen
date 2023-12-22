import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int K = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<A;i++){
            list.add(1);
        }
        for(int i=0;i<B;i++){
            list.add(0);
        }
        for(int i=0;i<C;i++){
            list.add(-1);
        }
        
        int sum=0;
        for(int i=0;i<K;i++){
            sum += list.get(i);
        }
        
        System.out.println(sum);
    }
}
