//package AtCoder_163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int l=1,r=n;
        boolean visited[]=new boolean[n+1];
        long ans=0;
        while(l<=r){
//            System.out.println(l+" "+r);
            long max=Long.MIN_VALUE;
            int ind=-1;
            PriorityQueue<Info> left=new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Info> right=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    left.add(new Info(1l*a[i]*Math.abs(i-l),i));
                    right.add(new Info(1l*a[i]*Math.abs(i-r),i));
                }
            }
            long lval=left.peek().val;
            long rval=right.peek().val;
//            System.out.println(lval+" "+rval);
            if(lval>rval){
                l++;
                visited[left.peek().index]=true;
                ans+=left.peek().val;
            }
            else if(rval>lval){
                r--;
                visited[right.peek().index]=true;
                ans+=right.peek().val;
            }
            else{
                Info ri=right.remove();
                Info le=left.remove();
                if(left.size()!=0){
                    if(left.peek().val>right.peek().val){
                        r--;
                        ans+=ri.val;
                        visited[ri.index]=true;
                    }
                    else{
                        l++;
                        ans+=le.val;
                        visited[le.index]=true;
                    }
                }
                else{
                    ans+=ri.val;
                    r--;
                    visited[ri.index]=true;
                }
            }
        }
        System.out.println(ans);
    }
}

class Info implements Comparable<Info>{
    long val;int index;
    public Info(long val,int ind){
        this.val=val;
        this.index=ind;
    }

    @Override
    public int compareTo(Info o) {
        if(this.val<o.val){
            return -1;
        }
        if(this.val>o.val){
            return 1;
        }
        return 0;
    }
}