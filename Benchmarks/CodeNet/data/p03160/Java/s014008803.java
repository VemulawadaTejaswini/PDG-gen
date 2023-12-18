import java.util.*;
public class Main{
  public static long[] memo;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    memo = new long[N];
    Arrays.fill(memo, -1L);
    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }
    System.out.println(solve(h));
  }
  
  public static long saiki(int[] array, int index, int lastIndex){
    if(index >= array.length){
      return 1000000000;
    }
    if(index == array.length-1){
      return Math.abs(array[index] - array[lastIndex]);
    }
    if(memo[index] != -1){
      return memo[index] + Math.abs(array[index] - array[lastIndex]);
    }
    
    long tmp = Math.abs(array[index] - array[lastIndex]);
    long min = Math.min(saiki(array, index+1, index), saiki(array, index+2, index));
    memo[index] = min;
    return tmp + min;
  }
  
  public static long solve(int[] array){
    return Math.min(saiki(array, 1, 0), saiki(array, 2, 0));
  }
}