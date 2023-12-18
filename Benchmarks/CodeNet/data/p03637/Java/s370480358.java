import java.util.*;

class Test{
    public static void main(String[] args){
        int N = 6;
        long[] a = new long[]{2,7,1,8,2,8};
        int odd = 0;
        int two = 0;
        int four = 0;
        for(int i=0;i<N;i++){
            if(a[i]%2==1) odd++;
            else{
                if(a[i]%4==0) four++;
                else two++;
            }
        }
        String ans = "No";
        if(four>=odd) ans = "Yes";
        if(four==odd-1&&two==0) ans="Yes";
        System.out.println(ans);
    }
}