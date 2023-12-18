import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        long[] v = new long[(int)(n)];
        for(int i = 0 ; i < n ; i++){
                v[i] = sc.nextLong();
        }
        solve(n, v);
    }

    static void solve(long n, long[] v){
        List<Long> even = new ArrayList<Long>();
        List<Long> odd = new ArrayList<Long>();
        for(int i = 0 ; i < n/2 ; i++ ){
            even.add(v[i*2]);
            odd.add(v[i*2+1]);
        }
        Map result_even = Sort(even);
        Map result_odd = Sort(odd);
        List<Long> E_value = new ArrayList<>(result_even.keySet());
        List<Integer> E_count = new ArrayList<>(result_even.values());
        List<Long> O_value = new ArrayList<>(result_odd.keySet());
        List<Integer> O_count = new ArrayList<>(result_odd.values());
        if (E_value.get(0).equals(O_value.get(0))) {
            E_count.add(0);
            O_count.add(0);
            System.out.println( Math.min(n-E_count.get(0)-O_count.get(1) , n-E_count.get(1)-O_count.get(0) ) );
        }else{
            System.out.println(n-E_count.get(0)-O_count.get(0));
        }
    }

    static Map<Long, Integer> Sort(final List<Long> list){
        Map<Long,Integer> map = list.stream().collect(
            Collectors.groupingBy( Function.identity(),Collectors.summingInt(s->1)) );
        Map<Long, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<Long, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return result;
    } 

}
