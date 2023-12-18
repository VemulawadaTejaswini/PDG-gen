import java.util.*;
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System. in);
    int n, m;
    int[] t = new int[100000];
    n = sc.nextInt();
    int[] p = new int[n];
    int[] x = new int[100000];
    for(int i = 0;i < n; i++){
      t[i] = sc.nextInt();
    }
    m = sc.nextInt();
    for(int i = 0;i < m; i++){
      p[i] = sc.nextInt();
      x[i] = sc.nextInt();
    }

    for(int i = 0; i < m; i++){
      int sum = 0;
      for(int j = 0; j < n; j++){
      //System.out.println(i + " " + j + " " + p[i] + " " + x[i]);//デバッグ
        if(j+1 == p[i]){
          sum += x[i];
        }else{
          sum += t[j];
        }
      }
      System.out.println(sum);
    }
  }
}