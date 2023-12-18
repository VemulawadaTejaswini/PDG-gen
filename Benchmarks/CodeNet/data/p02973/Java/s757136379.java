import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] a = new int[N];
      int[] sum = new int[N];
      Arrays.fill(sum, 0);
      int i=0;
      int j=0;
      int count=1;
      int mem=100000001;
      a[0] = sc.nextInt();
      for(i=1;i<N;i++){
        a[i] = sc.nextInt();
        if(a[i]<=a[i-1]){
          if(mem>=a[i]){
            count++;
          }
          mem=a[i];
        }
      }
      System.out.println(count);
    }
}