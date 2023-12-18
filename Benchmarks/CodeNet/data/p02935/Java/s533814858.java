import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        double num[] = new double[n];
        double sum = 0;
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextDouble();
        }
        
        Arrays.sort(num);
        
        for(int i = 0; i < n - 1; i++){
            num[i + 1] = (num[i] + num[i + 1]) / 2;
        }
        
        
        System.out.println(num[n - 1]);
    }
}
