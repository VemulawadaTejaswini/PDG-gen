import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0]){
          return o2[2]-o1[2];
        }else{
          return o1[0] - o2[0];
        }
      }
    });

    for (int i = 0; i < M; i++) {
      int cost = sc.nextInt();
      int b = sc.nextInt();
      int key = 0;
      for (int j = 0; j <b ; j++) {
        int box = sc.nextInt() -1;
        key += 1<< box;
      }
      int[] pair = {cost,key,b};
      pq.offer(pair);
    }

    int isOpen = 0;
    int totalCost =0;
    while (!pq.isEmpty()) {
      int[] pp = pq.remove();
      int cost = pp[0];
      int key = pp[1];
      int tmp = isOpen | key;
      if(tmp == isOpen){
        continue;
      }
      totalCost += cost;
      isOpen = tmp;
      if(isOpen == ( (1<<N)-1)){
        System.out.println(totalCost);
        return;
      }
    }
    System.out.println(-1);
  }


}
