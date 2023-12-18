import java.io.*;
import java.util.*;

public class  Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        char [][]ch=new char[H][W];
        for(int i=0;i<H;i++) {
            String next = sc.next();
            ch[i]=next.toCharArray();
        }
        if(H==0||W==0)
        {
            System.out.println(0);
            return;
        }
        int [][]step=new int[H+1][W+1];
        for(int i=0;i<=H;i++)
            step[i][0]=Integer.MAX_VALUE;
        for(int i=0;i<=W;i++)
            step[0][i]=Integer.MAX_VALUE;
        step[0][1]=0;
        for(int i=1;i<H+1;i++)
            for(int j=1;j<W+1;j++){
                int num=ch[i-1][j-1]=='#'?1:0;
                step[i][j]=Math.min(step[i-1][j],step[i][j-1])+num;
            }
        System.out.println(step[H][W]);
    }
}