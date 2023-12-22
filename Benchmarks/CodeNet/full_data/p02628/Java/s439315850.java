import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] p = new int[N];
      int sacrifice = 0;
      int sum = 0;
      
      for(int i=0;i<N;i++){
        p[i] = sc.nextInt();
      }
      
      for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
          if(p[i] > p[j]){
            sacrifice = p[i];
            p[i] = p[j];
            p[j] = sacrifice;
          }
        }
      }
      
      for(int i=0;i<K;i++){
        sum += p[i];
      }
      
      System.out.println(sum);
	}
}