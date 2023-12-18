import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long S = 0;
        for(int i = 0; i < N; i++){
            S += i;
        }
        
        System.out.println(S);
    }
}

