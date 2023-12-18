
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            minHeap.add(num);
            maxHeap.add(num);
        }

        int ans =0;
        int val =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N-1; i++) {
            int min = minHeap.poll();
            int max = minHeap.poll();

            if((N-1-i)%2 ==0){
                val = max-min;
                sb.append(max +" "+min+"\n");
            }else{
                val = min-max;
                sb.append(min +" "+max+"\n");
            }

            minHeap.add(val);
        }

        System.out.println(val);
        System.out.println(sb.toString());
    }

}
