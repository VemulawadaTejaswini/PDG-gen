import java.util.Scanner;
                import java.util.ArrayList;
                import java.util.Collections;
            	import java.util.Arrays;
                 
                public class Main { //クラス名はMain
                    public static void main(String[] args) {
                        //コード
                      Scanner sc = new Scanner(System.in);
                      String c1 = sc.nextLine();
            		  String[] strArray1 = c1.split(" ");
                      boolean b1 = false;		//フラグ
                      //文字列リテラル　→　整数変換
                      Integer[] x = new Integer[strArray1.length];
                		for (int i = 0; i < strArray1.length; i++) {
                    	x[i] = Integer.parseInt(strArray1[i]);
                		}
                      Arrays.sort(x);
                      int syoukin = 0;  //賞金
                      //追加賞金フラグ
                      if (x[0] == 1 && x[1] == 1){
               b1 = true;
              }
              else{
                b1 = false;
              }
                      switch (x[0]) {
        case 1:
            syoukin = syoukin +  300000 ;
            break;
        case 2:
            syoukin = syoukin +  200000 ;
            break;
        case 3:
            syoukin = syoukin +  100000 ;
            break;
      }
                      switch (x[1]){
                case 1:
            syoukin = syoukin +  300000 ;
            break;
        case 2:
            syoukin = syoukin +  200000 ;
            break;
        case 3:
            syoukin = syoukin +  100000 ;
            break;
      }
                      
                      
                      //追加賞金判定
                      
               if (b1 == true){
               System.out.println(syoukin +  400000);
              }
              else{
                System.out.println(syoukin);
              }
                }
                }