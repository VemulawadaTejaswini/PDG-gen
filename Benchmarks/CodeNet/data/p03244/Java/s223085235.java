import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> oddmap = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
        TreeMap<Integer,Integer> evenmap = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(i % 2 == 0){
                if(evenmap.containsKey(a)){
                    evenmap.put(a,evenmap.get(a)+1);
                }else{
                    evenmap.put(a,1);
                }
            }else{
                if(oddmap.containsKey(a)){
                    oddmap.put(a,oddmap.get(a)+1);
                }else{
                    oddmap.put(a,1);
                }
            }
        }
        PriorityQueue<Point> odd = new PriorityQueue<>();
        PriorityQueue<Point> even = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> e : oddmap.entrySet()){
            odd.add(new Point(e.getKey(), e.getValue()));
        }
        for(Map.Entry<Integer,Integer> e : evenmap.entrySet()){
            even.add(new Point(e.getKey(), e.getValue()));
        }
        Point odd1 = odd.poll();
        Point even1 = even.poll();
        if(odd1.key != even1.key){
            System.out.println(n - odd1.value - even1.value);
        }else{
            int odd2 = odd.size() != 0 ? odd.poll().value : 0;
            int even2 = even.size() != 0 ? even.poll().value : 0;
            System.out.println(Math.min(n - odd1.value - even2 , n - odd2 - even1.value));
        }
    }
}

class Point implements Comparable<Point>{
    int key,value;
    public Point(int k, int v){
        this.key = k;
        this.value = v;
    }
    
    public int compareTo(Point p){
        if(this.value > p.value){
            return -1;
        }else if(this.value < p.value){
            return 1;
        }
        return 0;
    }
}
