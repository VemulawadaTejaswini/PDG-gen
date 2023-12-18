import java.util.*;
class ManyFormulas{
    static long dp(int i, long sum, int flag,int a[]){
        int t[] = new int [a.length];
        for(int j = 0; j < a.length; j++){
            t[j] = a[j];
        }
        if(i != 0 && flag == 0) t[i] = t[i-1]*10 + t[i];
        if(i != 0 && flag == 1) sum += t[i - 1]; 
        if(a.length-1 == i) return sum += t[t.length - 1];
        return dp(i+1,sum, 0, t) + dp(i+1, sum, 1, t);
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        int a[] = new int[s.length()];
        for(int i = 0; i < a.length; i++){
            a[i] = s.charAt(i) - '0';     
        }
        long ans = dp(0, 0, 0, a);
        System.out.println(ans);
    }
}