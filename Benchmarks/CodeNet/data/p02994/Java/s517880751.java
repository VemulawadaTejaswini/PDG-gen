import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int l = sc.nextInt();
        
        //理想のパイ
        int allPie = makePie(n,l,n+1);
        
        int min = 0;//絶対値比較変数。初回に絶対上書きする必要あり
        int Pie =0;
        int outPie = 0;
        int eatNum = 0;
        for(int i=0;i<n;i++){
         Pie = makePie(n,l,i);//i番目を食べたパイ
         if(i==0){//初回は上書き
           min = Math.abs(Math.abs(allPie)-Math.abs(Pie));
           outPie = Pie;
           eatNum = i;
         }
           if(Math.abs(min)> Math.abs(Math.abs(allPie)-Math.abs(Pie))){
             min = Math.abs(Math.abs(allPie)-Math.abs(Pie));
             outPie = Pie;
             eatNum = i;
           }
        }
        // 出力
		//System.out.println(allPie+""+outPie+" "+min+" "+eatNum);
        System.out.println(outPie);
	}
  
  //アップルパイ作成関数※林檎総数、おいしさ定数、食べた林檎※n+1以上指定で全使用
  public static int makePie(int n,int l,int eatNum){
    int sum=0;
    for(int i=0;i<n;i++){
      if(i==eatNum) continue;
      sum+=l+(i+1)-1;//配列は0からなので
      
    }
    return sum;
  }
}