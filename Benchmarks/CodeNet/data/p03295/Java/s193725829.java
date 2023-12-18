
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] a = new int[M][2];
    for (int i = 0; i < M; i++){
      a[i][0] = scanner.nextInt();
      a[i][1] = scanner.nextInt();
    }
  Arrays.sort(a, new Comparator<int[]>(){
    @Override
    public int compare(int[] o1, int[] o2){
      return o1[1] - o2[1];
    }
  });

  int count = 0;
  for (int i = 0; i < M;){
    count++;
    int right = a[i][1];
    i++;
    while (i < M && a[i][0] < right){
      i++;
    }
  }
    System.out.println(count);
  }
}
