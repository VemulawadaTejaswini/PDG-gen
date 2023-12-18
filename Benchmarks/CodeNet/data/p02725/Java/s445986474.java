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
   Arrays.sort(a, Comparator.reverseOrder());

   for (int i = 0; i<N; i++){
    if(a[i] > K/2){
      a[i] = a[i]/2;
    } 
   }
   for (int i = 1; i < N; i++){
    Plus += a[i] - a[i-1];
   }
   System.out.println(Plus + a[0]);
}
}