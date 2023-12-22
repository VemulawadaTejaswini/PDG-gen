import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num_list = new int[n];
    for (int i = 0; i < n; i++){
      num_list[i] = sc.nextInt();
    }
    max_value(num_list, n);
  }

  public static void max_value(int[] lst, int n){
    int maxval = -2000000000;
    int minval = lst[0];
    for (int i = 0; i < n - 1; i++){
      maxval = Math.max(maxval, lst[i + 1] - minval);
      minval = Math.min(minval, lst[i + 1]);
    }
    System.out.println(maxval);
  }
}
