import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PriorityQueue<Long> pQueue;
        Integer N, M, P;
        Long Y;
        List<String> Ids;
        int[] filled;
        HashMap<String,Integer> dict = new HashMap<>();
        HashMap<Long, Integer> yearToPref = new HashMap<>();
        HashMap<Integer,Integer> cityToIndex = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Ids = new ArrayList<>();
        pQueue = new PriorityQueue<>();
        int numCities = 0;
        filled = new int[N];
        for(int i=0;i<M;i++){
            P = sc.nextInt();
            Y = sc.nextLong();
            pQueue.add(Y);
            Ids.add(String.valueOf(Y));
            yearToPref.put(Y,P);
            dict.put(Ids.get(Ids.size()-1),i);
            if(!cityToIndex.containsKey(P)){
                cityToIndex.put(P,numCities);
                numCities++;
            }
        }
        int idx;
        String prefecture, order;
        while(pQueue.size()>0){
            Y = pQueue.peek();
            P = yearToPref.get(Y);
            pQueue.remove(Y);
            filled[cityToIndex.get(P)]++;
            idx = Ids.indexOf(String.valueOf(Y));
            prefecture = padLeft(String.valueOf(P),6).replace(' ','0');
            order = padLeft(String.valueOf(filled[cityToIndex.get(P)]),6).replace(' ','0');;
            Ids.set(idx, prefecture.concat(order));
        }

        for(int i=0;i<Ids.size();i++)
            System.out.println(Ids.get(i));

    }
    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}
