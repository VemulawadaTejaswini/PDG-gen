import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        Map<Long, Long> shops = new HashMap<Long, Long>();
  
        for (long i =0; i<N; i++) {
            shops.put(sc.nextLong(), sc.nextLong());
        }

        Object[] mapkey = shops.keySet().toArray();
        Arrays.sort(mapkey);

        long result = 0;
        long tempM = M;
        for (Long nKey : shops.keySet())
        {
            tempM -= shops.get(nKey);
            if (tempM <=0){
                result += (tempM + shops.get(nKey)) * nKey;
                System.out.println(result);
                      sc.close();
              return;
            }
            result += shops.get(nKey) * nKey;
        }
    }
}