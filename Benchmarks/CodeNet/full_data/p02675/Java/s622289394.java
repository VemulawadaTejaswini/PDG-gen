import java.util.Scanner;
class Main{
  			public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			//数値kと文字列sを入力
			int k = sc.nextInt();
            String s = sc.next();
            //文字列sの文字数をaに代入
            int a = s.length();
              
            //aがk以下ならばそのままsを出力、
            //上回る場合はsをk文字分取り出して末尾に...をつけて出力
            if(k>=a){
              System.out.println(s);
            }else{
              System.out.println(s.substring(0,k)+"...");
            }
        }
	}