import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        /*int n=cin.nextInt();
        int x=cin.nextInt();
        int y=cin.nextInt();
        int num[][]=new int[n+1][n+1];
        num[x][y]=1;
        int sum[]=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(num[i][j]!=0){
                    num[i][j]=Math.min(num[i][j],Math.abs(i-j));
                    sum[num[i][j]]++;
                    sum[Math.abs(i-j)]++;
                }
                else{
                    if(i<=x&&j>=y){
                        num[i][j]=x-i+1+y-j;
                        sum[x-i+1+y-j]++;
                    }

                        num[i][j]=Math.abs(i-j);
                        sum[Math.abs(i-j)]++;

                }
            }
        }
        for(int i=1;i<n;i++){
            System.out.println(sum[i]);
        }*/
        int X=cin.nextInt();
        int Y=cin.nextInt();
        int A=cin.nextInt();
        int B=cin.nextInt();
        int C=cin.nextInt();

        Integer[] num=new Integer[A];

        Integer[] num1=new Integer[B];
        Integer[] num2=new Integer[C+X+Y];
        for(int i=0;i<A;i++){
            num[i]=cin.nextInt();
        }
        Arrays.sort(num, 0, A, Collections.reverseOrder());
        for(int i =0; i<B; i++){
            num1[i] = cin.nextInt();
        }
        Arrays.sort(num1,0,B,Collections.reverseOrder());
        for(int i=0;i<C; i++){
            num2[i]=cin.nextInt();
        }
        for(int i=C; i<C+X;i++){
            num2[i]=num[i-C];
        }
        for(int i=C+X;i<C+X+Y; i++){
            num2[i]=num1[i-C-X];
        }
        Arrays.sort(num2,0,C+X+Y,Collections.reverseOrder());
        long sum =0;
        for(int i=0;i<X+Y; i++){
            sum+=num2[i];
        }
        System.out.println(sum);

    }
}
