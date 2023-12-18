import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h=sc.nextLong(),w=sc.nextLong();
        if(h*w%3==0){
            System.out.println(0);
            return;
        }
        long ans=Long.MAX_VALUE;
        for(int i=0;i<3;i++){
            ans=Math.min(ans, Math.abs(Math.max(w*(h/3+i),Math.max((h-h/3-i)*(w/2),(h-h/3-i)*(w%2==0?w/2:w/2+1)))-Math.min(w*(h/3+i),Math.min((h-h/3-i)*(w/2),(h-h/3-i)*(w%2==0?w/2:w/2+1)))));
        }
        for(int i=0;i<3;i++){
            ans=Math.min(ans, Math.abs(Math.max(h*(w/3+i),Math.max((w-w/3-i)*(h/2),(w-w/3-i)*(h%2==0?h/2:h/2+1)))-Math.min(h*(w/3+i),Math.min((w-w/3-i)*(h/2),(w-w/3-i)*(h%2==0?h/2:h/2+1)))));
        }
        System.out.println(ans);
    }
}