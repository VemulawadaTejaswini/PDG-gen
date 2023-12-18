import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt()-1;
        int ans = N-K;
        
        System.out.println(ans);
    }
}