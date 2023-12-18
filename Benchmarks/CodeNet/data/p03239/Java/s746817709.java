import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int cost[] = new int[n];
        int time[] = new int[n];
        int i;
        int ans = 0;
        for(i = 0;i < n;i++){
          cost[i] = sc.nextInt();
          time[i] = sc.nextInt();
          if(time[i] <= t){
            if(ans > cost[i] || ans == 0){
              
            ans = cost[i];
            }
          }
        }
      	if(ans == 0){
           System.out.println("TLE");   
        }else{
     	   System.out.println(ans);   
        }
    }
}