import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long N = sn.nextInt();
        long A = sn.nextInt();
        long B = sn.nextInt();
        long cnt = 0;

        if(A % 2 == B % 2){
            cnt = (B-A)/2;
        }else{
            cnt = Math.min((A-1)+(B-A+1)/2, (N-B)+(B-A+1)/2);
        }

        System.out.println(cnt);
    }
}