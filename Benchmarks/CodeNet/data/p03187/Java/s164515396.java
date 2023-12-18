import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong();
    int N = sc.nextInt();
    long[] X = new long[N+1];
    X[0] = 0;
    for(int i = 1; i <= N; i++){
      X[i] = sc.nextLong();
    }
    System.out.println(solve(N, X, L));
  }
  
  public static long solve(int N, long[] X, long L){
    return Math.max(func(N, N, X, 0,true, 0, L), func(N, N, X, 0,false, 0, L));
  }
  
  public static long func(int pN, int N, long[] array, long sum, boolean der, int index, long L){
    if(N == 0){
      return sum;
    }
    long[] arrayCopy = Arrays.copyOf(array, array.length);
    int lastIndex = index;
    boolean flag = false;
    if(der){
      do{
        index++;
        if(index == pN+1){
          index = 0;
          flag =true;
        }
      }while(arrayCopy[index] == 0);
    }else{
      do{
        index--;
        if(index == -1){
          index = pN;
          flag =true;
        }
      }while(arrayCopy[index] == 0);
    }
    if(!flag){
      sum += Math.abs(arrayCopy[index]-arrayCopy[lastIndex]);
    }else if(der){
      sum += Math.abs(L - arrayCopy[lastIndex] + arrayCopy[index]);
    }else{
      sum += Math.abs(L - arrayCopy[index] + arrayCopy[lastIndex]);
    }
    arrayCopy[lastIndex] = 0;
    return Math.max(func(pN, N-1, arrayCopy, sum, true, index, L), func(pN, N-1, arrayCopy, sum, false, index, L));
  }
}