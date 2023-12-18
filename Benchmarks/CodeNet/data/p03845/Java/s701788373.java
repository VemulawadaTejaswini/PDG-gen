import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int t[] = new int[n];
        int count = 0;
        for(int i = 0;i < n;i++){
          t[i] = sc.nextInt();
          count += t[i];
        }
      
     	int m = sc.nextInt();
        int p[] = new int[m];
        int x[] = new int[m];
        int ans[] = new int[m];
        for(int i = 0;i < m;i++){
          p[i] = sc.nextInt();
          x[i] = sc.nextInt();
          ans[i] = t[p[i] - 1] - x[i];
        }

        
        for(int i = 0;i < m;i++){
          System.out.println(count - ans[i]);
        }
    }
}