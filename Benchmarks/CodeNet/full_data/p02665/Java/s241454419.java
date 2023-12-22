import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    long answer = 0;
    String[] input = sc.nextLine().split(" ");
    int[] nodeCount = new int[n + 1];
    long[] maxNodeCount = new long[n + 1];
    long[] minNodeCount = new long[n + 1];
    for(int i = 0; i <= n; i++){
      nodeCount[i] = Integer.parseInt(input[i]);
    }
    int idx = n;
    maxNodeCount[idx] = nodeCount[idx];
    minNodeCount[idx] = nodeCount[idx];
    idx--;
    while(idx >= 0){
      maxNodeCount[idx] = maxNodeCount[idx + 1] + nodeCount[idx];
      idx--;
    }
    minNodeCount[0] = 1;
    for (int i = 1; i <= n; i++){
      minNodeCount[i] = Math.min((minNodeCount[i -1] - nodeCount[i - 1]) * 2, maxNodeCount[i]);
      if(minNodeCount[i] < nodeCount[i]){
        System.out.print(-1);
        return;
      }
    }
    if(minNodeCount[n] != nodeCount[n]){
      System.out.print(-1);
      return;
    }
    for(long cnt : minNodeCount){
      answer += cnt;
    }
    System.out.print(answer);
  }
}