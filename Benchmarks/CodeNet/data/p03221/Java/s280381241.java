import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for(int i = 0 ; i < m; i++) {
            p.add(sc.nextInt());
            y.add(sc.nextInt());
        }
        Map<Integer,Map<Integer,Integer>> lookup = getLookupTable(p,y);
        for(int i = 0; i < m ;i++) {
            print(p.get(i),lookup.get(p.get(i)).get(y.get(i)));
        }
    }
    private static Map getLookupTable(List<Integer> p, List<Integer> y) {
        Map<Integer,List<Integer>> perfYear = new HashMap<>();
        for(int i = 0; i < p.size(); i++) {
            if(!perfYear.containsKey(p.get(i))) {
                perfYear.put(p.get(i),new ArrayList<Integer>());
            }
            perfYear.get(p.get(i)).add(y.get(i));
        }
        for(Map.Entry<Integer,List<Integer>> entry : perfYear.entrySet()) {
            Collections.sort(entry.getValue());
        }
        return getPerfYearIndexMap(perfYear);
    }
    private static Map<Integer,Map<Integer,Integer>> getPerfYearIndexMap(Map<Integer,List<Integer>> perfYear){
        Map<Integer,Map<Integer,Integer>> perfYearIndexMap = new HashMap<>();
        perfYear.forEach((K,V) -> {
            if(!perfYearIndexMap.containsKey(K)) {
                perfYearIndexMap.put(K, new HashMap<Integer,Integer>());
            }
            Map<Integer,Integer> yearIndex = perfYearIndexMap.get(K);
            int count = 1;
            for(Integer a : V) {
                yearIndex.put(a,count);
                count++;
            }
        });
        return perfYearIndexMap;
    }
    private static int countDigit(int n) {
        if(n == 0) return 0;
        return 1 + countDigit(n/10);
    }
    private static void print(int p, int y) {
        int pDig = countDigit(p);
        int yDig = countDigit(y);
        StringBuilder sb = new StringBuilder();
        int MAX_DIGIT = 6;
        while(pDig < MAX_DIGIT) {
            sb.append('0');
            pDig++;
        }
        sb.append(String.valueOf(p));
        while(yDig < MAX_DIGIT) {
            sb.append('0');
            yDig++;
        }
        sb.append(String.valueOf(y));
        System.out.println(sb.toString());
    }
}