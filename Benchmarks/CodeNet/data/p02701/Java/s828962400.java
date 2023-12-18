import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            String S = sc.next();
            set.add(S);
        }

        System.out.println(set.size());



    }

}







