import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] seq=new int[n*n];
        for(int i=0;i<n*n;i++){
            seq[i]=sc.nextInt();
        }
        int[][] sq=new int[n+2][n+2];
        int sum=0;
        for(int i=0;i<n+2;i++){
            for(int j=0;j<n+2;j++){
                sq[i][j]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sq[i+1][j+1]=n*i+j+1;
            }
        }
        int left=0,right=0,up=0,down=0;
        for(int i=0;i<n*n;i++){
            left=0;
            right=0;
            up=0;
            down=0;
            int row=(seq[i]-1)/n+1;
            int col=(seq[i]-1)%n+1;
            for(int temp=0;temp<row;temp++){
                if(sq[temp][col]>0) up++;
            }
            for(int temp=row+1;temp<n+2;temp++){
                if(sq[temp][col]>0) down++;
            }
            for(int temp=0;temp<col;temp++){
                if(sq[row][temp]>0) left++;
            }
            for(int temp=col+1;temp<n+2;temp++){
                if(sq[row][temp]>0) right++;
            }
            int min=Math.min(up,down);
            min=Math.min(min,left);
            min=Math.min(min,right);
            sum+=min;
            sq[row][col]=0;
        }
        System.out.println(sum);
        sc.close();
    }
}