import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long N = sn.nextInt();
        long A = sn.nextInt();
        long B = sn.nextInt();
        long cnt = 0;

        if(A % 2 == B % 2){
            cnt = Math.abs(A-B)/2;
        }else{
            cnt = Math.min(A-1, N-B)+1+(Math.abs(A-B)-1)/2;
        }

        System.out.println(cnt);
    }
}