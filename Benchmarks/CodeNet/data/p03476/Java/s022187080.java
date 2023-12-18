import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static boolean[] isPrime;
    static int[] sumOf2017ishNum;

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

    static void calculateSumOf2017ish(int primeNumMax){
        sumOf2017ishNum = new int[primeNumMax+1];
        sumOf2017ishNum[0] = 0;
        for(int i = 1; i <= primeNumMax; i++){
            int p = (i+1) / 2;
            if(isPrime[i] && isPrime[p]){
                sumOf2017ishNum[i] = sumOf2017ishNum[i-1] + 1;
            }else {
                sumOf2017ishNum[i] = sumOf2017ishNum[i-1];
            }
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int primeNumMax = 100000;
        createPrimeNumberList(primeNumMax);
        calculateSumOf2017ish(primeNumMax);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = sumOf2017ishNum[r] - sumOf2017ishNum[l-1];
            System.out.println(count);
        }
    }
    public static void main(String[] args){
        solve();
    }
}
