import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          int c1 = 0;	//2の何乗
          int ttl = 0;  //計算回数
          int moto = 0; //計算用変数
          int taihi = 0;//退避用変数
          Scanner sc = new Scanner(System.in);
    	   c1 = sc.nextInt();
    	   String c2 = sc.next();
          int dec = Integer.parseInt(c2, 2);
          //判定
         for(int i=0;i<=dec;i++) {
            moto = i;
            taihi = i;
            while(true) {
            //現在の整数が奇数なら、1を引いて 2で割る。そうでなければ、2 で割って 2N−1を足す。
          		if (Math.abs(taihi) % 2 == 0) {
                //偶数文字
                  taihi = (taihi / 2) + (int)Math.pow(2, (c1 - 1));
                  ttl++;
                  if(java.util.Objects.equals(taihi,moto)){
                  break;
                  }
            }
            else {
              	//奇数文字
               taihi = (taihi - 1 ) / 2;
              	ttl++;
               if(java.util.Objects.equals(taihi,moto)){
              	break;
               }
           }
            }
          }
          //計算表示
          System.out.println(ttl % 998244353);
        }
    }