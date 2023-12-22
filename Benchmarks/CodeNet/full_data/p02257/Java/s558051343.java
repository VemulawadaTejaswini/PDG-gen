import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collections;

public class Main{
    public static void main(String[] args) throws Exception{
        int number;
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> exist = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for(int i = 0; i<n ; i++) {
            line = br.readLine();
            number = Integer.parseInt(line);
            if(isPrime(number)){
                prime.add(number);
            }
        }
//        Collections.sort(exist);
//        number = exist.get(exist.size()-1);
//
//        if(number >= 2){
//            prime.add(2);
//        }
//
//        for (int i = 3; i <= number; i += 2) {
//            isPrime = true;
//            for (int p : prime) {
//                comp = (double) i / (double) p;
//                if (p == 1) {
//                    continue;
//                }
//                if (i % p == 0) { //iが見つかった素数で割り切れる
//                    isPrime = false;
//                    break;
//                } else if (p > comp) {
//                    break;
//                }
//            }
//            if (isPrime) {
//                prime.add(i);
//            }
//        }
//        for( int e : exist){
//            if(prime.contains(e)){
//                count++;
//            }
//        }
        
        System.out.println(prime.size());
    }
//  素直に解説のとおりに実装
    static boolean isPrime(int n){
        if(n==2) {
            return true;
        }
        if(n<2 || n%2==0){
            return false;
        }

        int i = 3;
        while(i<=Math.sqrt((double)n)){
            if(n%i==0){
                return false;
            }
            i = i + 2;
        }
        return true;
    }
}