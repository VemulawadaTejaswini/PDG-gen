import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int h[]=new int[N];
        int m[]=new int[N];
        int sum[]=new int[200];
    	for(int i=0;i<200;i++){
    	    sum[i]=14400;
    	}
        int x=0;
        for(int i=0;i<N;i++){
            h[i]=sc.nextInt();
            m[i]=sc.nextInt();
            sum[x]=h[i]*60+m[i];
            x++;
        }
	    
        int M=sc.nextInt();
        int k[]=new int[M];
        int g[]=new int[M];
        for(int i=0;i<M;i++){
            k[i]=sc.nextInt();
            g[i]=sc.nextInt();
            int cnt2=0;
            for(int j=0;j<x;j++){
                if(sum[j]==k[i]*60+g[i]){
                    cnt2++;
                }
            }
            if(cnt2==0){
                sum[x]=k[i]*60+g[i];
                x++;
            }
        }
        Arrays.sort(sum);
        for(int i=0;i<x-1;i++){
            System.out.print(sum[i]/60+":");
            sum[i]=sum[i]%60;
            if(sum[i]/10==0){
                System.out.print("0"+sum[i]+" ");
            }else{
                System.out.print(sum[i]+" ");
            }
        }
        System.out.print(sum[x-1]/60+":");
        sum[x-1]=sum[x-1]%60;
        if(sum[x-1]/10==0){
            System.out.print("0"+sum[x-1]);
        }else{
            System.out.print(sum[x-1]);
        }
        System.out.println();
    }
}
