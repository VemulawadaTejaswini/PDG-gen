import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int count = 0;
        for(int i = 0; i < N; i++){
            
            int r = sc.nextInt();
            int l = sc.nextInt();
            count += l - r + 1;
        }
        System.out.println(count);
        
        sc.close();
    }
}
