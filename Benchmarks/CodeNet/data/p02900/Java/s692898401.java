import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = get_great_common_divisor(a,b);
        //System.out.println(gcd);
        int count = prime_factorization(gcd);
        System.out.println(count);
    }

    //最大公約数を返すメソッド
    public static int get_great_common_divisor(int a,int b) {
        int gcd=0;
        /*if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }*/

        //余りがでなければ終了
        if (a % b == 0) {
            return b;
        }

        gcd = a % b;
        return get_great_common_divisor(b,gcd);
        
    }

    //素因数分解するメソッド
    public static int prime_factorization(int n) {
        int y = n;
        int count = 0;
        Set<Integer> set = new HashSet<>();

        //切り上げのため+1
        n = (int)Math.sqrt(n) + 1;
        for(int i=2; i<=n; i++){
            while(y % i == 0){
                y = y / i;  
                set.add(i);            
            }
            //yが√nより早めに割り切れた場合、無駄削減
            if(y == 1){
                break;
            }
        }
        //組み合わせに1も入れるから+1
        return set.size()+1;
    }
}