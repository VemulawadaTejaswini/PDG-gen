import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long t = 0;
        for(int i = 0;i <= X;i++){
            if(t+i < X){
                t += i;
            }else if(t+i == X){
                System.out.println(i);
                return;
            }else{
                long T = Math.min(X-t, (t+i-X)*2+1);
                System.out.println(i-1+T);
                return;
            }
        }
    }
}