import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans;

        if((B-A)%2==0){
           ans = (B-A)/2;
        }else{
            long stop=0;
            long turn=0;
            if((N-B)>A-1){
                stop = B-1;
                turn = (((long)(B-A)/2)+1) + (A-1);
            }else{
                stop = N-A;
                turn = (((long)(B-A)/2)+1) + (N-B);
            }
            ans = Math.min(stop, turn);
        }


        System.out.println(ans);

    }
}
