import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        ArrayList<Integer> list = divisor(x);

        for (Integer v: list
             ) {
            int max = v;
            int min = 0;
            long ba = ((long)Math.pow(max, 5));
            long bb = ((long)Math.pow(min, 5));
            boolean isUp = ba - bb < x;
            while (true) {
                long a = ((long)Math.pow(max, 5));
                long b = ((long)Math.pow(min, 5));
                long minus = a - b;
                if (minus == x) {
                    System.out.println(max + " " + min);
                    return;
                }
                if (isUp && minus > x) {
                    break;
                }
                if (!isUp && minus < x) {
                    break;
                }
                if (isUp) {
                    max++;
                    min++;
                } else {
                    max--;
                    min--;
                }
            }
        }
    }

    /**
     * (正の)約数列挙O(√n)
     * @param n
     * @return	nの約数列(sortはされてないよ)
     */
    public static ArrayList<Integer> divisor(int n){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(int i=1; i*i <= n; i++){
            if( n % i == 0){
                ret.add(i);
                //n=PQ+0→ PもQも約数. ただし、Q=Pは↑で登録済みなので登録しない
                if( i != n/i ) ret.add(n/i);
            }
        }
        return ret;
    }
}