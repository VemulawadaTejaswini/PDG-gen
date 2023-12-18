import java.util.*;
import java.io.*;

public class Main{
    public static int gj(int a,int b){
        if(a%b==0)return b;
        return gj(b,a%b);
    }
    public static void sort(int data[],int n){
        int mininum,memory;
        for(int i=0;i<n-1;i++){
            mininum=data[i];
            memory=i;
            for(int j=i+1;j<n;j++){
                if(data[j]<mininum){
                    mininum=data[j];
                    memory=j;
                }
            }
            data[memory]=data[i];
            data[i]=mininum;
        }
    }

    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        for(int i=0;i<n;i++)ary[i]=sc.nextInt();
        sc.close();
        int gt=1,a=1,count;
        sort(ary,n);
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                count=0;
                if(j!=i){
                    a=gj(Math.min(ary[i],ary[j]),Math.max(ary[i],ary[j]));
                    for(int k=0;k<n;k++){
                        if(k!=i&&k!=j){
                            if(ary[k]%a!=0){
                                count++;
                                if(count>1)break;
                            }
                        }
                    }
                }
                if(count<=1&&a>gt)gt=a;
            }
        }
        System.out.println(gt+"\n");
    }
}