import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<5;i++){
            int win=1;
            int color[][]=new int[3][9];
            for (int j=0;j<3;j++) Arrays.fill(color[j],10);
            int num[]=new int[9];
            for (int j=0;j<9;j++) num[j]=sc.nextInt();
            int color_num[]=new int[3];
            for (int j=0;j<9;j++){
                char c=sc.next().charAt(0);
                if (c=='R') color[0][color_num[0]++]=num[j];
                if (c=='G') color[1][color_num[1]++]=num[j];
                if (c=='B') color[2][color_num[2]++]=num[j];
            }
            for (int j=0;j<3;j++) Arrays.sort(color[j]);
            if (color_num[0]%3!=0||color_num[1]%3!=0||color_num[2]%3!=0) win=0;
            for (int j=0;j<3&&win!=0;j++){
                for (int k=0;k<color_num[j]/3;k++){
                    if (color[j][k]==color[j][k+2]){
                        color[j][k]=0;
                        color[j][k+1]=0;
                        color[j][k+2]=0;
                    }
                }
            }

            for (int j=0;j<3;j++){
                for (int l=0;l<3;l++){
                int bef=-2;
                int changed=0;
                    for (int k=0;k<color_num[j];k++){
                        int now=color[j][k];
                        if ((now!=0&&changed==0)||now==bef+1){
                            color[j][k]=0;
                            changed++;
                            bef=now;
                        }
                        if (changed==3) break;
                    }
                }
            }
            for (int j=0;j<3;j++){
                for (int k=0;k<color_num[j];k++){
                    if (color[j][k]!=0) win=0;
                }
            }
            System.out.println(win);
        }
    }
}