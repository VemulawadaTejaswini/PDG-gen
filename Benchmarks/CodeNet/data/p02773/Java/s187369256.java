import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Counter> counters = new ArrayList<>();
        Map<String, Integer> index = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            String key = scanner.next();
            Counter counter = new Counter(key);
            if(index.containsKey(key)){
                counters.get(index.get(key)).increment();
            }else{
                counters.add(counter);
                index.put(key, counters.size() - 1);
            }
        }

        Collections.sort(counters, new Comparator<Counter>() {
            @Override
            public int compare(Counter o1, Counter o2) {
                if(o1.count == o2.count){
                    return o1.key.compareTo(o2.key);
                }
                return o2.count - o1.count;
            }
        });

        int max = counters.get(0).count;

        for(Counter counter : counters){
            if(max <= counter.count){
                System.out.println(counter.key);
            }
        }

    }

    static class Counter {
        public String key;
        public int count;

        public Counter(String key){
            this.key = key;
            this.count = 1;
        }

        public void increment(){
            this.count += 1;
        }

        public int hashCode(){
            return this.key.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return this.key.equals(((Counter)obj).key);
        }
    }

}