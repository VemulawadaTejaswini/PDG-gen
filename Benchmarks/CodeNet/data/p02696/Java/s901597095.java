import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long max = 0;
        
        for(int i = 1; i < N + 1; i++){
            long b = A * i / B;
            long c = i / B;
            long a = b - (A * c);
            if(max < a){
                max = a;
            }
        }
        System.out.println(max);
    
    }
}