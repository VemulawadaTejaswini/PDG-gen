import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<>(new MyComparator());
        for(int i=0;i<n;i++){
            pq.add(sc.nextLong());
        }
        for(int i=0;i<m;i++){
            long tmp = pq.poll();
            tmp = tmp/2;
            pq.add(tmp);
        }
        Long res = 0L;
        for(Long p : pq){
            res += p;
        }
        System.out.println(res);
    }
}

class MyComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {

        long num1 = (long)obj1;
        long num2 = (long)obj2;

        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}