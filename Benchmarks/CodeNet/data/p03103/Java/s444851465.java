import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next()); // 店数
        int M = Integer.parseInt(sc.next()); // 買いたい数
        Map<Long, Integer> map = new TreeMap<Long, Integer>();
 
        for (int i = 0; i < N; i++) {
            Long A = sc.nextLong();
            int B = sc.nextInt();
            map.put(A,B);
        }
        Long sum = 0L;
        // int j = 0;
        for(Long a: map.keySet()){
            int tmp = map.get(a);
            if(tmp> M){
                sum += M*a;
                break;
            }else{
                sum += tmp*a;
                M -= tmp;
            }
        }
        System.out.print(sum);
    }
}