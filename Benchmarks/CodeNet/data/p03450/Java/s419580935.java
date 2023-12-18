/*
 * x 軸上に N 人の人が立っています。 人 i の位置を xi とします。 任意の i に対して、xi は 0 以上 109 以下の整数です。 同じ位置に複数の人が立っていることもありえます。
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
            int[][] distance = new int[n][n];
            int flag = 0;
            int a = 0;
            
            for(int i=0; i<n; i++){
            	for(int j=0; j<n; j++){
            		if(i==j){
            			distance[i][j] = 0;
            		}else{
            			distance[i][j] = 10001;
            		}
            	}
            }

            while(flag == 0 && a < m){
            	int l = Integer.parseInt(sc.next())-1;
            	int r = Integer.parseInt(sc.next())-1;
            	int d = Integer.parseInt(sc.next());
            	if(distance[l][r] == 10001){
            		distance[l][r] = d;
            		distance[r][l] = -d;
            		for(int i=0; i<n; i++){
                		if(distance[i][l] < 10001 && distance[i][r] == 10001){
                			distance[i][r] = distance[i][l] + distance[l][r];
                		}else if(distance[i][r] < 10001 && distance[i][l] == 10001){
                			distance[i][l] = distance[i][r] + distance[r][l];
                		}
                		
                		if(distance[r][i] < 10001 && distance[l][i] == 10001){
                			distance[l][i] = distance[l][r] + distance[r][i];
                		}else if(distance[l][i] < 10001 && distance[r][i] == 10001){
                			distance[r][i] = distance[r][l] + distance[l][i];
                		}
                		
                		if(distance[l][i] < 10001 && distance[i][r] < 10001){
                			if(distance[l][i] + distance[i][r] != d){
                				flag = 1;
                			}
                		}
                		if(distance[r][i] < 10001 && distance[i][l] < 10001){
                			if(distance[r][i] + distance[i][l] != -d){
                				flag = 1;
                			}
                		}
                	}
            	}else{
            		if(distance[l][r] != d){
            			flag = 1;
            		}
            	}
            	a++;
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
	