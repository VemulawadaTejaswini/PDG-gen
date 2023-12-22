import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] a = new int[N];
      for(int i = 0; i < N; i++){
        int a[i] = sc.nextInt();
      }
      
      int n = 0;
      for(int j = 0; j < N; j++){
        if(j % 2 == 1 && a[j] % 2 == 1){
          n++;
        }
      }
      system.out.println(n);
    }
}