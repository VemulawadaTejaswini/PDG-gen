import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] ary=new int[n];
        Arrays.fill(ary,-1);
        boolean flag=true;
        for(int i=0;i<m;i++){
            int s=sc.nextInt();
            int c=sc.nextInt();
            if(ary[s-1]>-1&&ary[s-1]!=c){
                flag=false;
            }else{
                ary[s-1]=c;
            }
        }
        if(!flag||(ary[0]==0&&n!=1)){
            System.out.println(-1);
        }else if(n==1){
            System.out.println(ary[0]);
        }else{
            for(int i=0;i<n;i++){
                if(ary[i]==-1){
                    if(i==0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }else{
                    System.out.print(ary[i]);
                }
            }
            System.out.println();
        }
    }
}