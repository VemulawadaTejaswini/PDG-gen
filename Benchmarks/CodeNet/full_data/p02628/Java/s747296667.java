import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 全何種類で何種類買うか取得
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	
      	// 配列の作成
      	int prices[] = new int[n];
      	for(int i=0;i<n;i++){
        	prices[i] = sc.nextInt();
        }
		//ソート
      	Arrays.sort(prices);
      	//合計を求める
      	int sum=0;
      	for(int i=0;i<k;i++){
        	sum += prices[i];
        }
		// 出力
		System.out.println(sum);
	}
}