        import java.util.Scanner;
        import java.util.ArrayList;
        import java.util.Collections;
    	import java.util.Arrays;
         
        public class Main { //クラス名はMain
            public static void main(String[] args) {
                //コード
              Scanner sc = new Scanner(System.in);
              int mojilen = Integer.parseInt(sc.nextLine());
              String c2 = sc.nextLine();
    		  String[] strArray1 = c2.split(" ");
              String c3 = sc.nextLine();
    		  String[] strArray2 = c3.split(" "); 
              boolean b1 = true;		//フラグ
              //文字列リテラル　→　整数変換
              int[] x = new int[strArray1.length];
        		for (int i = 0; i < strArray1.length; i++) {
            	x[i] = Integer.parseInt(strArray1[i]);
        		}
              Arrays.sort(x);
              //文字列リテラル　→　整数変換
              int[] y = new int[strArray2.length];
        		for (int j = 0; j < strArray2.length; j++) {
            	y[j] = Integer.parseInt(strArray2[j]);
        		}
              Arrays.sort(y);
              int a = 0;
              int b = 0;
              //判定
              loop: for(int k=0;k<mojilen;k++) {
                	a = x[k];
                	b = y[k];         
               		if (a <= b) {
                    	//満たすとき
                      a = 0;
                      b = 0;
               		 }
              	else {
                  		//満たさないとき
                        b1 = false;
                		break loop;
                }
              }
       if (b1 == true){
       System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
        }
        }