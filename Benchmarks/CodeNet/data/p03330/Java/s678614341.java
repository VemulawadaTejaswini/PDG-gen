import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;


import java.util.HashSet;
import java.util.Collections;


public class Main{
    static Scanner sc=new Scanner(System.in);
    static int N=sc.nextInt();
    static int C=sc.nextInt();
    static int[][]D=new int[C][C];
    static int[][]c=new int[N][N];
    public static void main(String[] args){
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                D[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                c[i][j]=sc.nextInt()-1;
            }
        }
        int[][]kazu=new int[3][C];
        for(int i=0;i<3;i++){
            for(int j=0;j<C;j++){
                kazu[i][j]=0;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                kazu[(i+j)%3][c[i][j]]++;
            }
        }
        int min=999999;
        int sum=0;
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                for(int k=0;k<C;k++){
                    if((i!=j)&&(j!=k)&&(i!=k)){
                        sum=0;
                        for(int l=0;l<C;l++){
                            sum+=D[l][i]*kazu[0][l];
                            sum+=D[l][j]*kazu[1][l];
                            sum+=D[l][k]*kazu[2][l];
                        }
                        min=Math.min(min,sum);
                        
                        
                    }
                }
            }
        }
        System.out.println(min);


        
        

            

        
        
        
        
            

        
        

    }
    }
