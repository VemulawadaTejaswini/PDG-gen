import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        double count = 0;
        double ave,check, last = Integer.MAX_VALUE;
        int ans = 0;
        for(i = 0;i < n;i++){
          a[i] = sc.nextInt();
          count += a[i];
        }
        ave = count / n;

		for(i = 0;i < n;i++){
          check = ave - a[i] ;
          check = Math.abs(check);
          if(check < last){
            last = check;
            ans = i;
          }
        }
      	System.out.println(ans);
    }
}