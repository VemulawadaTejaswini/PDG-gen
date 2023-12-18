import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        if(k < 10)
            System.out.println(k);
        else {
            Sol sol = new Sol(k);
            sol.preComp();
        }
    }
}

class Sol {
    long[][] pre;
    int k, l;
    Stack<Integer> res;
    
    Sol(int k){
        this.k = k;
        this.l = 12;
        pre = new long[l][11];
        res = new Stack<>();
    }
    
    void preComp(){
       // base
       for(int dig = 0; dig < 10; ++dig){
           pre[1][dig] = 1;
       }
       pre[1][10] = 9;
       
       int stLen = 0;
       long globSum = 9;
       boolean esc = false;
       
       // rest
       for(int len = 2; len < l; ++len){
           for(int dig = 0; dig < 10; ++dig){
               for(int st = -1; st < 2; ++st){
                    int newDig= dig+st;
                    if(newDig < 0 || newDig > 9)
                        continue;
                    pre[len][dig] += pre[len-1][newDig]; 
               }
               long val = pre[len][dig];
               if(dig != 0){
                   globSum += val;
                   if(globSum >= k){
                       k -= (globSum-val);
                       stLen = len-1;
                       res.add(dig);
                       esc = true;
                       break;
                   }
               }
           }
           if(esc)
                break;
       }
        search(stLen,res.peek());
        StringBuilder sb = new StringBuilder();
        for(int el : res)
            sb.append(el);
        System.out.println(sb);
    }
    
    void search(int len, int currDig){
        if(len==0)
            return;
        
        if(k == 1 && currDig == 1){
            while(len-->0)
                res.add(0);
            return;
        }
        long tSum = 0;
        for(int st = -1; st < 2; ++st){
            int newDig = currDig+st;
            if(newDig < 0 || newDig > 9)
                continue;
            tSum += pre[len][newDig];
            if(tSum >= k){
                res.add(newDig);
                k -= (tSum - pre[len][newDig]);
                search(len-1, newDig);
                break;
            }
        }
    }
}