
import java.util.*;
import java.io.*;
public class Main
{
    static int[] ar;
    static int[][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader bff=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wff=new PrintWriter(System.out);
        bff.readLine();
        String[] st=bff.readLine().split(" ");
        ar=new int[st.length];
        for(int i=0;i<st.length;i++){
            int k=Integer.parseInt(st[i]);
            ar[i]=k;
        }
        dp=new int[ar.length][2];
        for(int[] aux:dp){
            Arrays.fill(aux,-1);
        }
        int res=Math.min(calcular(ar[0],1,0),calcular(ar[0],1,1));
        wff.println(res);
        wff.flush();
    }

    public static int calcular(int k,int i,int way){
        int res=1;
        if(i<ar.length){
            if(way==-1){
                int aux=ar[i];
                if(aux!=k){
                    if(k-aux>0){
                        res=calcular(aux,i+1,0);
                    }
                    else{
                        res=calcular(aux,i+1,1);
                    }
                }
                else{
                    res=calcular(k,i+1,way);
                }
            }
            else{
                if(dp[i][way]==-1){
                    int aux=ar[i];
                    if(way==0){
                        if(k-aux>=0){
                            res=Math.min(1+calcular(aux,i+1,-1),calcular(aux,i+1,way));
                        }
                        else{
                            res=1+calcular(aux,i+1,-1);
                        }
                    }
                    else{
                        if(k-aux<=0){
                            res=Math.min(1+calcular(aux,i+1,-1),calcular(aux,i+1,way));
                        }
                        else{
                            res=1+calcular(aux,i+1,-1);
                        }
                    }
                    dp[i][way]=res;
                }
                else{
                    res=dp[i][way];
                }
            }
        }
        return res;
    }
}
