import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        System.out.println((N*(N-1)/2) + (M*(M-1)/2));
    }
}
