import java.util.*;
public class Main {
    public static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }
    public static int lcm(int m, int n) { return m * n / gcd(m, n);}
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

//        int N = 1;
//        int M = 1;
//        String S = "c";
//        String T = "c";
        int L = lcm(N,M);
        int res = L;

        HashMap<Integer, Character> map = new HashMap<>();
        for(int i=0; i<S.length(); i++){
            map.put(i * L / N + 1, S.charAt(i));
        }
        for(int i=0; i<T.length(); i++){
            if( map.get(i * L / M + 1) !=null){
                if( map.get(i * L / M + 1) != T.charAt(i)){
                    res = -1;
                    break;
                }
            }
        }
        System.out.println(res);
	}
}
