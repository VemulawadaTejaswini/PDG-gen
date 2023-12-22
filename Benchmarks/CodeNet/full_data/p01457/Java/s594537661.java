import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        long left = (long)0, right = (long)0;
        String[] ans = new String[q];
        for(int i=0; i<q; i++){
            long p = sc.nextLong();
            String c = sc.next();
            long n = sc.nextLong();
            if(c.equals("(")) left += n;
            else right += n;
            if(left==right) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}