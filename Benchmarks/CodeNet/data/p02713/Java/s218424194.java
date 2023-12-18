import java.io.*;
import java.util.*;

public class Main{
    static int[][] gcd=new int[201][201];

    private static int fanc1(int[] ary){
        int g=0;
        if(gcd[ary[0]][ary[1]]>0){
            g=gcd[ary[0]][ary[1]];
        }else{
            g=fanc2(ary[0],ary[1]);
        }
        if(gcd[(int)Math.max(g,ary[2])][(int)Math.min(g,ary[2])]>0){
            return gcd[(int)Math.max(g,ary[2])][(int)Math.min(g,ary[2])];
        }else{
            return fanc2((int)Math.max(g,ary[2]),(int)Math.min(g,ary[2]));
        }
    }

    private static int fanc2(int a,int b){
        if(gcd[a][b]>0)return gcd[a][b];
        if(a%b==0)return (gcd[a][b]=b);
        return (gcd[a][b]=fanc2(b,a%b));
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long total=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                for(int l=1;l<=k;l++){
                    int[] ary={i,j,l};
                    Arrays.sort(ary);
                    total+=fanc1(ary);
                }
            }
        }
        System.out.println(total);
    }
}