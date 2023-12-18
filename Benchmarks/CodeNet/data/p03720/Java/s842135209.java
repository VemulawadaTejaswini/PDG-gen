import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      // 都市数
	  int N = sc.nextInt();
      // 道路本数
	  int M = sc.nextInt();
      //カウント
      int[] count = new int[N];
      for(int i=0;i<M*2;i++){
        count[sc.nextInt()-1]++;
      }
      for(int i=0;i<N;i++){
        System.out.println(count[i]);
      }
    }
}