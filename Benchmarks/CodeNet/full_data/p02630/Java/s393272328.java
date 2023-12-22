import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        int[] count = new int[100_001];
        long total = 0;
        
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            count[A]++;
            total += A;
        }
        
        final int Q = sc.nextInt();
        
        StringBuilder str = new StringBuilder();
        final String BR = System.lineSeparator();
        
        for (int j = 0; j < Q; j++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            total += (C - B) * count[B];
            
            count[C] += count[B];
            count[B] = 0;
            
            str.append(total).append(BR);
        }
        
        System.out.println(str);
    }
}
