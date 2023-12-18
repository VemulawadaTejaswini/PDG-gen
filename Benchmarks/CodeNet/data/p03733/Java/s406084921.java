import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int T = sc.nextInt();
      int[] t = new int[N];
      int sum = 0;
      for(int i=0;i<N;i++){
        t[i] = sc.nextInt();
        if(i>0){
          if(t[i-1]+T>t[i]){//前の人のスイッチでまだ流れてたら
            t[i]=t[i]-t[i-1];
          }
        }
        sum += t[i];
      }
      System.out.println(sum);
    }
}