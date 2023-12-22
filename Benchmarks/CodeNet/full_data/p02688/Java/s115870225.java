import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> nSet = new HashSet<Integer>();

        for(int i = 1;i<=N;i++){
            nSet.add(i);
        }
        for(int i=0;i<K;i++){
            int d = sc.nextInt();
            for(int j=0;j<d;j++){
                nSet.remove(sc.nextInt());
            }
        }
        System.out.println(nSet.size());

    }

}







