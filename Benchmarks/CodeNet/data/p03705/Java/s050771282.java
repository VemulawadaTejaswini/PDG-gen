import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(N < 2 && A != B) {
            System.out.println(0);
            return;
        }
        int answer = 0;
        
        if(A < B) answer = (N-2)*(B-A);
        else if(A == B) answer = 1;
        else answer = 0;
        System.out.println(answer);
    }
}
