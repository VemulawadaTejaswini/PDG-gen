import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      int last = 0;
      for(int i=0;i<n;i++){
        a[i] = sc.nextLong();
      }

      //もし今日の金額より高い値段の日があるなら買う
      
      //もし今の手持ちよりも安くなる日があるなら、
      //その日までのうち一番高い日で売却
      //そして安くなる日に購入
      //購入条件としては、
      //今日の金額より高い値段があるなら
      //100購入1000
      //130売却1300
      //115購入@11+35
      //150売却1650+45
      
      long stock = 0;//持ち株数
      long cash = 1000;//持ち現金
      int sellday = 0;//今より安い日
      int buyprice = 0;//
      long maxprice = 0;//期間中に一番高い日
      for(int i=0;i<n;i++){
        sellday = n;
        for(int j=i+1;j<n;j++){
          if( a[j] < a[j-1] ){
            sellday = j;
            break;
          }
        }
        maxprice = 0;
        for(int j=i+1;j<sellday&&j<n;j++){
          if( maxprice < a[j] ){
            maxprice = a[j];
          }
        }
        if( maxprice > 0 ){
        stock = cash / a[i];
        cash = cash % a[i];
        cash = cash + stock * maxprice;
        i = sellday - 1;
        stock = 0 ;
        }
        //System.out.println(i+"日目:"+stock+","+cash+","+sellday);
      }
      System.out.println(cash);
	}
}