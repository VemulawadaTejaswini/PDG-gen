import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	//参加人数
		int a = sc.nextInt();
      	//初期ポイント
      	int b = sc.nextInt();
      	//回数
      	int c = sc.nextInt();
		// 最初の持ち点を格納する
      	int[] point = new int[a];
     	int count = 0;
        for(int i=0;i<a;++i){
            point[i] = b;
        }
      	//ゲーム
      	while(sc.hasNext()){
           //正解者
          int d = sc.nextInt();
          for(int i=0;i<a;++i){
          	if(d!=(i+1)){
             //正解者ではなかったらー１する
            	point[i]-=1;
         	 }
            if(point[i]<=0){
              count = 1;
            }
          }
            if(count == 0){
              System.out.println("Yes");
            }else{
              System.out.println("No");
            }
        }
    }
}