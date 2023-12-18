import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int N = sc.nextInt();
    int Plus = 0;
    Integer a[] = new Integer[N];
   for (int i=0; i<N; i++) {
     a[i] = sc.nextInt();
   }
        for (int i = 0; i<N; i++){
    if(a[i] == 0){
      a[i] = K;
    } 
  }
   Arrays.sort(a, Comparator.reverseOrder());
    

   for (int i = 1; i < N; i++){
    Plus += a[i-1] - a[i];
   }
   System.out.println(Plus);
}
}