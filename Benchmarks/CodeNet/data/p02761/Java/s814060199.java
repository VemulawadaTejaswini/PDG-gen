import java.util.*;
public class Main {
    public static int max(int a, int b){return (a > b ? a : b);}
    public static int min(int a, int b){return (a < b ? a : b);}
    public static int gcd(int a, int b){return (b > 0 ? gcd(b, a % b) : a);}
    public static int lcm(int a, int b){return a / gcd(a, b) * b;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), M = sc.nextInt();
        int flg = 0;
        List<Integer>S = new ArrayList<Integer>();
        List<Integer>C = new ArrayList<Integer>();
        for(int i = 0; i < M; i++){
            int s = sc.nextInt(), c = sc.nextInt();
            S.add(s - 1);
            C.add(c);
        }
        for(int i = 0; i <= 999; i++){
            List<Integer>t = new ArrayList<Integer>();
            for(int j = i; j > 0; j /= 10)t.add(j % 10);
            if(t.size() == 0)t.add(0);
            if(N != t.size())continue;
            Collections.reverse(t);
            int f = 1;
            for(int j = 0; j < M; j++)if(t.get(S.get(j)) != C.get(j))f = 0;
            if(f == 1){
                flg = 1;
                System.out.println(i);
                break;
            }
        }
        if(flg == 0)System.out.println(-1);
    }
}
