/*
 * x 軸上に N 人の人が立っています。 人 i の位置を xi とします。 任意の i に対して、xi は 0 以上 10^9 以下の整数です。 同じ位置に複数の人が立っていることもありえます。
 * 
 * これらの人の位置に関する情報が M 個与えられます。 このうち i 個めの情報は (Li,Ri,Di) という形をしています。 
 * この情報は、人 Ri は人 Li よりも距離 Di だけ右にいること、 すなわち、xRi−xLi=Di が成り立つことを表します。
 * 
 * これら M 個の情報のうちのいくつかに誤りがある可能性があることがわかりました。 与えられる M 個すべての情報と矛盾しないような値の組 (x1,x2,…,xN) が存在するかどうか判定してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int[] states = new int[n];
            int[] flags = new int[n];
            int[][] distance = new int[m][3];
            int flag = 0;
            int[] flag_data = new int[m];
            int flagDataCounter = 0;
            int updateCounter = 0;
            
            for(int i=0; i<m; i++){
            	distance[i][0] = Integer.parseInt(sc.next())-1;
            	distance[i][1] = Integer.parseInt(sc.next())-1;
            	distance[i][2] = Integer.parseInt(sc.next());
            	flag_data[i] = 0;
            }
            for(int i=0; i<n; i++){
            	flags[i] = 0;
            	states[i] = 0;
            }

            while(flag == 0 && flagDataCounter < m){
            	if(updateCounter == 0){
            		for(int i=0; i<m; i++){
                		if(flag_data[i] == 0){
                			flags[distance[i][0]] = 1;
                			states[distance[i][0]] = 0;
                			break;
                		}
                	}
            		updateCounter = 1;
            	}else{
            		updateCounter = 0;
                	for(int i=0; i<m && flag == 0; i++){
                		if(flags[distance[i][0]] == 1 && flags[distance[i][1]] == 0){
                			states[distance[i][1]] = states[distance[i][0]] + distance[i][2];
                			flags[distance[i][1]] = 1;
                			updateCounter++;
                			flag_data[i] = 1;
                			flagDataCounter++;
                		}else if(flags[distance[i][0]] == 0 && flags[distance[i][1]] == 1){
                			states[distance[i][0]] = states[distance[i][1]] - distance[i][2];
                			flags[distance[i][0]] = 1;
                			updateCounter++;
                			flag_data[i] = 1;
                			flagDataCounter++;
                		}else if(flag_data[i] == 0 && flags[distance[i][0]] * flags[distance[i][1]] == 1){
                			if(states[distance[i][1]] - states[distance[i][0]] != distance[i][2]){
                				flag = 1;
                				break;
                			}else{
                				flag_data[i] = 1;
                				flagDataCounter++;
                				updateCounter++;
                			}
                		}
                	}
            	}
            }
            
            //出力
            if(flag == 1){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
            sc.close();
        }
    }
	