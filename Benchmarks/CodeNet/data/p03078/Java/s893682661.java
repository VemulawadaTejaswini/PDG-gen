import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int kk = sc.nextInt();
        
        List<Long> aList = new ArrayList<>();
        List<Long> bList = new ArrayList<>();
        List<Long> cList = new ArrayList<>();
        
        for(int i = 0; i < x; i++)
            aList.add(sc.nextLong());
        Collections.sort(aList, (a ,b) -> (int)(b - a));
        
        for(int i = 0; i < y; i++)
            bList.add(sc.nextLong());
        Collections.sort(bList, (a ,b) -> (int)(b - a));
            
        for(int i = 0; i < z; i++)
            cList.add(sc.nextLong());
        Collections.sort(cList, (a ,b) -> (int)(b - a));

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++)
                for(int k = 0; k < z; k++) {
                    pq.offer(aList.get(i) + bList.get(j) + cList.get(k));
                    if(pq.size() > kk)
                        pq.poll();
                }
        List<Long> list = new ArrayList<>();
        while(!pq.isEmpty())
            list.add(pq.poll());
        for(int i = list.size() - 1; i >= 0; i--)
            System.out.println(list.get(i));
    }
}
