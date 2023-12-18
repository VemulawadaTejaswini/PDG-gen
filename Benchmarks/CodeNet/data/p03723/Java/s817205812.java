import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int answer = 0;
        boolean isFirstLoop = true;
        
        int a1 = A, b1 = B, c1 = C, a2, b2, c2;
        while(hasNotOdd(a1, b1, c1)) {

            a2 = a1;
            b2 = b1;
            c2 = c1;
            
            a1 = b2 / 2 + c2 / 2;
            b1 = a2 / 2 + c2 / 2;
            c1 = a2 / 2 + b2 / 2;
            
            if(isScanedValue(A, B, C, a1, b1, c1)) {
                answer = -1;
                break;
            }
            
            answer++;
        }
        System.out.println(answer);
    }
    
    static boolean hasNotOdd(int a1, int b1, int c1) {
        return (a1 % 2 != 1 && b1 % 2 != 1 && c1 % 2 != 1);
    }
    
    static boolean isScanedValue(int A, int B, int C, int a1, int b1, int c1) {
        return (A == a1 && B == b1 && C == c1);
    }
}
