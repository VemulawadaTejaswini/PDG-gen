import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long I = 1L;
        int c  = 1000000007;
        for(int i = 1;i <= N; i++){
            I = I * i;
            I = I % c;
        }
        System.out.println(I);
    }
}