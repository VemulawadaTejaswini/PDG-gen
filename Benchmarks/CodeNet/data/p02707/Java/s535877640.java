import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int No = 0;
    int[] buka = new int[N+1];
    while(sc.hasNext()){
        buka[sc.nextInt()]++;
    }
    for(int i = 1;i <= N;i++){
        System.out.println(buka[i]);
    }
  }
}