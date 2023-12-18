import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int a, b;
        int kValue, aValue, bValue;
        TreeMap<Integer, Integer> numberMap = new TreeMap<Integer, Integer>();
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            
            if(numberMap.containsKey(a)) {
                bValue = numberMap.get(a);
                numberMap.put(a, b + bValue);
            } else {
                numberMap.put(a, b);
            }
        }
        
        kValue = K;
        while(kValue >= K) {
            aValue = numberMap.firstKey();
            answer = aValue;
            bValue = numberMap.get(aValue);
            
            numberMap.remove(aValue);
            
            kValue -= bValue;
        }
        
        System.out.println(answer);
    }
}
