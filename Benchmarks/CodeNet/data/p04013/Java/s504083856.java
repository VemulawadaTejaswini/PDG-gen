import java.util.*;
public class Main{
  public static Map<String, Long> map = new HashMap<>();
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int[] x = new int[N];
    for(int i = 0; i < N; i++){
      x[i] = sc.nextInt();
    }
    long result = ans(x, 0, 0, 0, A);
    System.out.println(result-1);
  }
  
  public static long ans(int[] array, int index, int sum, int n, int A){
    int[] tmp = {index, sum, n};
    if(map.containsKey(Arrays.toString(tmp))){
      return map.get(Arrays.toString(tmp));
    }
    
    if(index == array.length){
      if(A * n == sum){
        return 1L;
      }else{
        return 0L;
      }
    }
    
    long result = ans(array, index+1, sum+array[index], n+1, A) +
              ans(array, index+1, sum, n, A);
    map.put(Arrays.toString(tmp), result);
    return result;
  }
}