import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int a;
        long b;
        int kValue, aValue;
        long bValue;
        TreeMap<Integer, Long> numberMap = new TreeMap<Integer, Long>();
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
            a = scan.nextInt();
            b = scan.nextLong();
            
            if(numberMap.containsKey(a)) {
                bValue = numberMap.get(a);
                numberMap.put(a, b + bValue);
            } else {
                numberMap.put(a, b);
            }
        }
        
        kValue = K;
        while(kValue > 0 && !numberMap.isEmpty()) {
            aValue = numberMap.firstKey();
            answer = aValue;
            bValue = numberMap.get(aValue);
            
            numberMap.remove(aValue);
            
            kValue -= bValue;
        }
        
        System.out.println(answer);
    }
}
