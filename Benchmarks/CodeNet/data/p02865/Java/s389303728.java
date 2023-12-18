import java.util.Scanner;
         
        public class Main { //クラス名はMain
            public static void main(String[] args) {
                //コード
              Scanner sc = new Scanner(System.in);
              int n1 = sc.nextInt();
              int seigen = 0;
              //値の代入
              if (Math.abs(n1) % 2 == 0) {
                //偶数
                seigen = (n1 / 2);
              }
                else {
                //奇数
                  seigen = (n1 / 2);
                  seigen++;
              }
              
              int count = 0;
              for(int i=1;i<seigen;i++) {
                if (n1 - i > 0){
           			count++;
          			}
          		else{
            		// 処理なし
          			}
              }
              System.out.println(count);
        }
        }