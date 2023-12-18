import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        
        int powD = 1;
        for(int i = 0; i < D; i++){
            powD *= 100;
        }
        
        System.out.println(N * powD);
    }
}
