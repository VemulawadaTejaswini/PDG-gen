import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static boolean[] isPrime;

    static void createPrimeNumberList(int primeNumMax){
        isPrime = new boolean[primeNumMax+1];
        HashSet<Integer> checkedNumbers = new HashSet<Integer>();
        for(int i = 0; i <= primeNumMax; i++){
            if(checkedNumbers.contains(i) || i < 2){
                isPrime[i] = false;
            }else{
                isPrime[i] = true;
                int currentNum = i;
                while(currentNum <= primeNumMax){
                    checkedNumbers.add(currentNum);
                    currentNum += i;
                }
            }
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        createPrimeNumberList(100000);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int p1 = l; p1 <= r; p1++){
                int p2 = (p1+1) / 2;
                if (isPrime[p1] && isPrime[p2]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args){
        solve();
    }
}