

import java.util.Scanner;

public class Mains {
    static double[][] aa;
    static double maxx(int h,int t,int n,double p[]){
        if(h+t==n &&  h>t  ){
            return (double)1;
        }
        if(h+t==n && t>h){
            return (double)0;
        }
        if(aa[h][t]!=-1){
            return aa[h][t];
        }
        return aa[h][t]= (double)((double)p[h+t]*(double)maxx(h+1,t,n,p)+(double)((double)1-(double)p[h+t])*(double)maxx(h,t+1,n,p)) ;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double[] p=new double[n];
        for(int j=0;j<n;j++){
            p[j]= scanner.nextDouble();
        }
        aa=new double[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                aa[j][i]=-1;
            }
        }
        System.out.println(maxx(0,0,n,p));
    }


}
