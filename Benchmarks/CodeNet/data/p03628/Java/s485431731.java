import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        int mod = (int)Math.pow(10, 9)+7;

        long sum = 1;
        int left = 0; //左のドミノの状態 1なら1種類―1なら2種類

        int i = 0;
        while(i < N){
            if(i==0){
                if(s1.charAt(i) == s2.charAt(i)){
                    sum *= 3;
                    left = 1;
                    i++;
                } else {
                    sum *= 6;
                    left = -1;
                    i = i+2;
                }
            } else {
                if(s1.charAt(i) == s2.charAt(i)){
                    if(left == 1){
                        sum = sum*2%mod;
                        left = 1;
                        i++;
                    } else {
                        sum *= 1;
                        left = 1;
                        i++;
                    }
                } else {
                    if(left == 1){
                        sum = sum*2%mod;
                        left = -1;
                        i=i+2;
                    } else {
                        sum = sum*3%mod;
                        left = -1;
                        i = i+2;
                    }
                }
            }

        }
        System.out.println(sum);
        
    }
}