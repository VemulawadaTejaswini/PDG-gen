import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner ir=new Scanner(System.in);
        for(;;){
            int d=ir.nextInt();
            int w=ir.nextInt();
            if(d==0&&w==0){
                break;
            }
            int[][] e=new int[d][w];
            for(int i=0;i<d;i++){
                for(int j=0;j<w;j++){
                    e[i][j]=ir.nextInt();
                }
            }
            int res=0;
            for(int i=0;i<d;i++){
                for(int j=0;j<w;j++){
                    for(int k=i+2;k<d;k++){
                        for(int l=j+2;l<w;l++){
                            int ma=0;
                            int mi=10;
                            int tot=0;
                            for(int m=i;m<=k;m++){
                                for(int n=j;n<=l;n++){
                                    if(m==i||m==k||n==j||n==l){
                                        mi=Math.min(mi,e[m][n]);
                                    }
                                    else{
                                        ma=Math.max(ma,e[m][n]);
                                        tot+=e[m][n];
                                    }
                                }
                            }
                            if(mi>ma){
                                res=Math.max(res,(k-i-1)*(l-j-1)*mi-tot);
                            }
                        }
                    }
                }
            }
            out.println(res);
        }
        out.flush();
    }
}
