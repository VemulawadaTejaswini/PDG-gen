import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        boolean[] isExistNumber = new boolean[100000];
        
        for(int i = 0; i < N; i++) {
            int A = scan.nextInt();
            if(isExistNumber[A-1]) isExistNumber[A-1] = false;
            else isExistNumber[A-1] = true;
        }
        
        int count = 0;
        for(int i = 0; i < 100000; i++) {
            if(isExistNumber[i]) count++;
        }
        
        System.out.println(count);
    }
}
