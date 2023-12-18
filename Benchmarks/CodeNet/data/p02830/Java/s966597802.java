                import java.util.Scanner;
                import java.util.ArrayList;
                import java.util.Collections;
            	import java.util.Arrays;
                 
                public class Main { //クラス名はMain
                    public static void main(String[] args) {
                        //コード
                      Scanner sc = new Scanner(System.in);
                      int mojilen = Integer.parseInt(sc.nextLine());
                      String answer = "";
                      //変換前文字列
                      String c1 = sc.nextLine();
            		  String[] strArray1 = c1.split(" ");
             
                      //配列変換
                      String[] x = new String[mojilen];
                		for (int i = 0; i < mojilen; i++) {
                    	x[i] = strArray1[0].substring(i, i+1);
                		}
                      String[] y = new String[mojilen];
                		for (int j = 0; j < mojilen; j++) {
                    	y[j] = strArray1[1].substring(j, j+1);
                		}
                      //判定
                      loop: for(int k=0;k<mojilen;k++) {
                        	answer = answer + x[k] + y[k];
                      }
               System.out.println(answer);
                }
                }