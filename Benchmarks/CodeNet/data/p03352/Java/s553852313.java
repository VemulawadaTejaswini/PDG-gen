import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int[] dic = new int[]{1,2,3,5,7,11,13,17,19,23,29,31};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        for(int i=1;i<dic.length;i++){
            int base = dic[i];
            int cur = base*base;
            while(cur<=X){
                pq.add(cur);
                cur = cur*base;
            }
        }
        int ans = 0;
        while(pq.size()>1) ans = pq.poll();
        ans = pq.poll();

        System.out.println(ans);
    }
}