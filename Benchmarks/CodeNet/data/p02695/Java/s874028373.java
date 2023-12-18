import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
    int[][] abcd = new int[Q][4];
    for(int i=0;i<Q;i++){
      for(int j=0;j<4;j++){
        abcd[i][j] = sc.nextInt();
      }
    }
    Queue<Integer[]> queue = new ArrayDeque<>();
    for(int i=1;i<=M;i++){
      Integer[] arr = {i};
      queue.add(arr);
    }
    while(queue.peek().length < N){
      Integer[] arr = queue.poll();
      int tail = arr[arr.length-1];
      Integer[] arr_temp = new Integer[arr.length+1];
      for(int i=0;i<arr.length;i++){
        arr_temp[i] = arr[i];
      }
      for(int i=tail;i<=M;i++){
        arr_temp[arr_temp.length-1] = i;
        queue.add(arr_temp);
      }
    }
    
    int size = queue.size();
    int score = 0;
    for(int i=0;i<size;i++){
      Integer[] arr = queue.poll();
      int sc_temp = 0;
      for(int j=0;j<Q;j++){
        if(arr[abcd[j][1]-1] - arr[abcd[j][0]-1] == abcd[j][2]){
          sc_temp += abcd[j][3];
        }
      }
      score = Math.max(score, sc_temp);
    }
    System.out.println(score);
  }
  
}