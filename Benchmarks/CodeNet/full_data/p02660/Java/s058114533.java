import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long A = sc.nextLong();
        int ans =0;
        for(long i = 1; i<=A; i++){
            if(A%i==0){
                A /=i;
                ans++;
            }
        }
        System.out.println(ans);
    }
}