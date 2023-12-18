import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;
    int sum = 0;

    Integer a[] = new Integer[N];
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();      
    }
    Arrays.sort(a, Comparator.reverseOrder());
    
    for (int i = 0; i < N; i++){
     sum += a[i];
    }

    double com = (double)sum/(double)(4*M);

    for (int i = 0; i < M; i++){
      if(a[i] > com){
        count++;
      }
    }
    if(count == M){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
}
}
