import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int L = sc.nextInt();
    int[] connected1 = new int[N];
    int[] connected2 = new int[N];
    int[][] edge1 = new int[N][N];
    int[][] edge2 = new int[N][N];
    for(int i = 0; i < K; i++) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;
      edge1[p][q] = 1;
      edge1[q][p] = 1;
    }
    for(int i = 0; i < L; i++) {
      int r = sc.nextInt() - 1;
      int s = sc.nextInt() - 1;
      edge2[r][s] = 1;
      edge2[s][r] = 1;
    }
    LinkedList<Integer> que = new LinkedList<Integer>();
    int num1 = 1;
    int num2 = 1;
    for(int i = 0; i < N; i++) {
      if(connected1[i] == 0) {
        connected1[i] = num1;
        que.clear();
        que.add(i);
        while(que.size() > 0) {
          int a = que.poll();
          connected1[i] = num1;
          for(int j = 0; j < N; j++) {
            if(connected1[j] == 0 && edge1[i][j] == 1) {
              que.add(j);
            }
          }
        }
        num1++;
      }
    }
    que.clear();
    for(int i = 0; i < N; i++) {
      if(connected2[i] == 0) {
        connected2[i] = num2;
        que.clear();
        que.add(i);
        while(que.size() > 0) {
          int a = que.poll();
          connected2[i] = num2;
          for(int j = 0; j < N; j++) {
            if(connected2[j] == 0 && edge2[i][j] == 1) {
              que.add(j);
            }
          }
        }
        num2++;
      }
    }
    HashMap<ArrayList<Integer>, Integer> map = new HashMap<int[][], Integer>();
    for(int i = 0; i < N; i++) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(connected1[i]);
      list.add(connected2[i]);
      if(map.containsKey(list)) {
        map.put(list, map.get(list) + 1);
      } else {
        map.put(list, 1);
      }
    }
    for(int i = 0; i < N; i++) {
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      list2.add(connected1[i]);
      list2.add(connected2[i]);
      System.out.println(map.get(list2));
    }
  }
}