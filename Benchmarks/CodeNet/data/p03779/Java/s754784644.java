import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int t = 0;
        for(int i = 0;i < Long.MAX_VALUE;i++){
            if(t+i < X){
                t += i;
            }else if(t+i == X){
                System.out.println(i);
                return;
            }else{
                int T = Math.min(X-t, (t+i-X)*2+1);
                System.out.println(i-1+T);
                return;
            }
        }
    }
}