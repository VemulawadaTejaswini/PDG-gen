import java.io.*;
import java.util.*;

public class Main{
    static int[][] ary=new int[3][3];
    static boolean[][] bingo=new boolean[3][3];
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            Arrays.fill(bingo[i],false);
            for(int j=0;j<3;j++){
                ary[i][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            boolean flag=false;
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(ary[j][k]==b){
                        bingo[j][k]=true;
                        flag=true;
                    }
                }
                if(flag){
                    break;
                }
            }
        }
        for(int i=0;i<3;i++){
            if(bingo[i][0]&&bingo[i][1]&&bingo[i][2]){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        for(int i=0;i<3;i++){
            if(bingo[0][i]&&bingo[1][i]&&bingo[2][i]){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        if(bingo[0][0]&&bingo[1][1]&&bingo[2][2]){
            System.out.println("Yes");
            System.exit(0);
        }
        if(bingo[0][2]&&bingo[1][1]&&bingo[2][0]){
            System.out.println("Yes");
            System.exit(0);
        }
        System.out.println("No");
    }
}