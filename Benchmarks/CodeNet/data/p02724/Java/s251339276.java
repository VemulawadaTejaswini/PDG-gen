import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = (X/500)*1000 + ((X%500)/5)*5;
        System.out.println(ans);
    }
}
