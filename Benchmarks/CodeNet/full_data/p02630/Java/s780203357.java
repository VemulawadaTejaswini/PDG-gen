import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        Map<Long,Long> m = new HashMap<>();

        long sum = 0;
        for (int i = 0; i < N; i++) {
            long num = sc.nextInt();
            sum += num;
            if(m.containsKey(num)){
                m.put(num,m.get(num)+1);
            }else{
                m.put(num,1L);
            }
        }
        int Q = sc.nextInt();

        for (int i = 0; i < Q ; i++) {
            long from = sc.nextInt();
            long to = sc.nextInt();

            if(m.containsKey(from)){
                long n = (long)m.get(from);
                sum = sum - n * from + n * to;

                if(m.containsKey(to)){
                    m.put(to,m.get(to)+n);
                }else{
                    m.put(to,n);
                }
                m.put(from,0L);
            }else{

            }
            System.out.println(sum);
        }

    }

}