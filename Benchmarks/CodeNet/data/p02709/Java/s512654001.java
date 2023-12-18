//package AtCoder_163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        ArrayList<Info> infants=new ArrayList<>();
        for(int i=1;i<=n;i++){
            infants.add(new Info(i,Long.parseLong(st.nextToken())));
        }
        Collections.sort(infants,Collections.reverseOrder());
        long dp[][]=new long[n+1][n+1];
        for(int i=0;i<n;i++){
            Info curr=infants.get(i);
            for(int l=0;l<=i+1;l++){
                long op1=0,op2=0;
                int r=i+1-l;
                if(l!=0){
                    op1=dp[l-1][r]+curr.val*(Math.abs(l-curr.index));
                }
                if(r!=0){
                    op2=dp[l][r-1]+curr.val*(Math.abs(n-r+1-curr.index));
                }
                dp[l][r]=Math.max(op1,op2);
            }
        }
        long ans=0;
        for(int i=0;i<=n;i++){
            ans=Math.max(ans,dp[i][n-i]);
        }
        System.out.println(ans);
    }
}

class Info implements Comparable<Info>{
    long val;int index;
    public Info(int index,long val){
        this.val=val;
        this.index=index;
    }

    @Override
    public int compareTo(Info o) {
        return Long.compare(this.val,o.val);
    }
}