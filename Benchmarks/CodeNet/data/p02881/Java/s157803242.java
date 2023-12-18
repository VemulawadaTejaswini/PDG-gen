import java.util.*;
public class Main {
    public static void main(String[]args){
        // 標準入力
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = N;
        // 9*9の答えの格納
        List <Integer> factors = new ArrayList<Integer>();

        // 素因数分解
        for (int i = 2;i <= N;) {
            if (N % i == 0) { // 最小の因数を求める 
                factors.add(i);
                if (N != i)
                    N /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }
        
        if (factors.size() == 0){
            
            System.out.println(n-1);
        
        } else{
            
            // 組みあわせを格納する（重複なし）
            Set <Integer> pair = new HashSet<Integer>();
            
            for (int down  = (factors.size()-1) ;down == 1; down--){
                
                for (int up = 1 ; up == down ; up++){

                    pair.add(factors.get(down) * factors.get(up));
                }
            
            }
            
            Integer ans = null;
            for (Integer p : pair) {     
                Integer q = n / p ;
                if (ans != null && ans > (p - 1) + (q - 1)){
                
                    ans = (p - 1) + (q - 1);
                } else{
                
                    ans = (p - 1) + (q - 1);
                }
            }
            System.out.println(ans);
        }
    }   
       
}       