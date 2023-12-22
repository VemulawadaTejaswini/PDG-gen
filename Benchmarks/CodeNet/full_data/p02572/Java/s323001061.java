import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        long[] numbers = new long[x];
        scanner.nextLine();
        
        for(int i=0; i<x; i++){
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        long answer = 0;
        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                answer += numbers[i]*numbers[j];
            }
        }
        long y =(long) Math.pow(10,9) + 7;
        
        System.out.print(answer%y);
        
        
    }
}