        import java.util.Scanner;
        import java.util.ArrayList;
        import java.util.Collections;
    	import java.util.Arrays;
         
        public class Main { //クラス名はMain
            public static void main(String[] args) {
                //コード
              Scanner sc = new Scanner(System.in);
              int mojilen = sc.nextInt();
              String cw2 = sc.nextLine();  //改行文字空打ち
              String c2 = sc.nextLine();
    		  String[] strArray = c2.split(" ");  
              //文字列リテラル　→　整数変換
              long[] x = new long[(int)strArray.length];
        		for (int k = 0; k < strArray.length; k++) {
            	//x[k] = Integer.parseInt(strArray[k]);
                  x[k] = Long.parseLong(strArray[k]);
        		}
              long wa = 0;
              //計算
              loop: for(int i=0;i<=mojilen-1;i++) {
              	for(int j=i+1;j<=mojilen-1;j++){
                	wa =  wa + (x[i] ^ x[j]); 
              	}
              }
              wa = wa % (long)((int)(Math.pow(10, 9)) + 7);
              System.out.println(wa);
            }
        }