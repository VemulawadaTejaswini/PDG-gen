import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans=N*(N-1)/2;
        System.out.println(ans);
    }
}
