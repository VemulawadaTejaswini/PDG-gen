import java.util.*;
 
import java.io.*;
 
public class Main{

    public static void primeFactMax(HashMap<Integer, Integer> primeMax, int num, HashMap<Integer, Integer> prime){
        for(int i = 2; i <= num; i++){
            if(num == 1) return;
            if(num % i == 0){
                if(prime.get(i) == null){
                    prime.put(i, 1);
                }else{
                    prime.put(i, prime.get(i)+1);
                }
                if(primeMax.get(i) == null){
                    primeMax.put(i, 1);
                }else{
                    primeMax.put(i, Math.max(prime.get(i), primeMax.get(i)));
                }
                primeFactMax(primeMax, num/i, prime);
                break;
            }else{
                continue;
            }
        }
    }
    
    public static void primeFact(HashMap<Integer, Integer> prime, int num){
        for(int i = 2; i <= num; i++){
            if(num == 1) return;
            if(num % i == 0){
                if(prime.get(i) == null){
                    prime.put(i, 1);
                }else{
                    prime.put(i, prime.get(i)+1);
                }
                primeFact(prime, num/i);
                break;
            }else{
                continue;
            }
        }
    }
    public static long primeDivide(HashMap<Integer, Integer> gcVal, HashMap<Integer, Integer> val, long res){
        int sum;
        long result = 1;
        for(Integer i : gcVal.keySet()){
            sum = gcVal.get(i) - val.getOrDefault(i, 0);
            result *= ((long)Math.pow(i, sum))%res;
        }
        return result;
    }
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        
        HashMap<Integer, Integer> gcVal = new HashMap<Integer, Integer>();
        for(int i = 0; i < N; i++){
            HashMap<Integer, Integer> Val = new HashMap<Integer, Integer>();
            primeFactMax(gcVal, A[i], Val);
        }
        
        long sum = 0;
        for(int i = 0; i < N; i++){
            HashMap<Integer, Integer> Val = new HashMap<Integer, Integer>();
            primeFact(Val, A[i]);
            sum += primeDivide(gcVal, Val, 1000000007)%1000000007;
        }
        System.out.println(sum);

	}
} 