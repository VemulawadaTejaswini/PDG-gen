import java.util.Scanner;

public class Main {

    private static int N;
    private static int[] A;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        A = new int[N];
        
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println(isApproved() ? "APPROVED" : "DENIED");
        
    }

    private static boolean isApproved() {
        
        for(int a :A) {
            if(a % 2 == 0) {
                if(a % 3 == 0 
                        || a % 5 ==0) {
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;
        
    }
}
