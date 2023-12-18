import java.util.*;

public class Main{
    
    static List<Long> makeDivisor(long N){
        List<Long> arr = new ArrayList<>();
        for(int i = 1 ; i <= N; i++){
            if( (N % i) == 0) {
                arr.add((long)i);
            }
        }
        return arr;
    }
    static long countDigits(long a) {
        long digits = 1;
        long tmp = 0;
        if( a >= 10){
            do{
                tmp = a / 10;
                digits++;
                a = tmp;
            }while(tmp > 9);
        }else{
            digits = 1;
        }
        return digits;
    }
    static long function(long a, long b){
        long max;
        long digitsA = countDigits(a);
        long digitsB = countDigits(b);
        if(digitsA > digitsB) {
            max = digitsA;
        }else if (digitsA < digitsB) {
            max = digitsB;
        }else{
            max = digitsA;
        }
        return max;
    }
    static long minOf(List<Long> arr){
        long min = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) <= min) min = arr.get(i);
        }
        return min;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> arrDivisor = makeDivisor(N);
        
        List<Long> digits = new ArrayList<>();
        int count;
        for(int i = 0; i < arrDivisor.size(); i++){
            
            for(int j = i; j < arrDivisor.size()-1;j++){
                count = i;
                long tmpN = arrDivisor.get(count) * arrDivisor.get(j+1);
                if(tmpN == N){
                    long a = arrDivisor.get(j);
                    long b = arrDivisor.get(j+1);
                    digits.add(function(a,b));
                }
            }
            
        }
        
        long result = minOf(digits);

        System.out.println(result);
        
        
        
        
    }
    
}