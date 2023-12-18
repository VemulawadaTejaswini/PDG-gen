import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        int mod = (int)Math.pow(10, 9)+7;
        long ans = 1;
        int flag = 0;

        int pos = 0;
        while(pos < N){
            if(s1.charAt(pos) == s2.charAt(pos)){
                if(flag == 0){
                    ans = (ans*3)%mod;
                    pos++;
                    flag = 1;
                } else
                if(flag == 1){
                    ans = (ans*2)%mod;
                    pos++;
                } else
                if(flag == -1){
                    pos++;
                    flag = 1;
                }
            } else {
                if(flag == 0){
                    ans = (ans*6)%mod;
                    flag = -1;
                    pos += 2;
                } else
                if(flag == 1){
                    ans = (ans*2)%mod;
                    flag = -1;
                    pos += 2;
                } else
                if(flag == -1){
                    ans = (ans*3)%mod;
                    pos += 2;
                }
            }
        }
        System.out.println(ans);
    }
}