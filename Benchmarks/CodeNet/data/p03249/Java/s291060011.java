import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] D = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                D[i] = sc.nextLong();
        }
        solve(N, D);
    }

    static void solve(long N, long[] D){
        HashMap<Long, Long> G = new HashMap<Long, Long>();
        HashMap<Long, Long> V = new HashMap<Long, Long>();
        for(int i = 0 ; i < N ; i++) G.put((long)i+1, D[i]);
        
        G = G.entrySet().stream()
        .sorted(Entry.<Long,Long>comparingByValue().reversed())
        .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
        List<Long> S = new ArrayList<>(G.values());
        List<Long> Key = new ArrayList<>(G.keySet());
        int n[] = new int[(int)N];
        Long T[] = new Long[(int)N-1];
        for(int i = 0 ; i < N ; i++){
            n[i] = 1;
        }
        for(int i = 0 ; i < N-1 ; i++){
            T[i] = S.get(i)-(long)N+2*(long)n[i];
            int flag = 0;
            for(int j = i+1 ; j < N ; j++){
                if(S.get(j).equals(T[i])){
                    n[j] += n[i];
                    V.put(Key.get(i),Key.get(j));
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("-1");
                System.exit(0);
            }
        }
        for (Long key : V.keySet()) {
            System.out.println(key + " " + V.get(key));
        }
		
    }
}
