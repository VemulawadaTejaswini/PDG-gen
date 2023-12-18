import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ary=new int[2][n];
        for(int i=0;i<n;i++){
            ary[0][i]=sc.nextInt();
            ary[1][i]=i+1;
        }
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(ary[0][j]==i){
                    System.out.print(ary[1][j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}