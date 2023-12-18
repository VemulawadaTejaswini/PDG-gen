import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> hSet = new HashSet<Integer>();
        int[] hArray = new int[N+1];
        int M = sc.nextInt();
        hArray[0] = 1000000000;
        for (int i=1; i<=N;i++) {
            hSet.add(i);
            hArray[i] = sc.nextInt();
        }

        for(int i=0;i<M;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(hArray[A] >= hArray[B]){
                hSet.remove(B);
            }
            if(hArray[B] >= hArray[A]){
                hSet.remove(A);
            }

        }


        System.out.println(hSet.size());

    }

}







