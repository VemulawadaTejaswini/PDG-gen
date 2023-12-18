import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        Double[] a = new Double[n+1];
        a[0] = 0d;
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += Double.parseDouble(sc.next());
            a[i] = sum;
        }
        
        double middle = sum / 2;
        int l = lowerBound(a, middle);
        
        System.out.println((long)(Math.min(middle - a[l-1], a[l] - middle)*2));
    }
    
    private static int lowerBound(Double[] a, double key){
        
        return ~Arrays.binarySearch(a, key, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
    }
}