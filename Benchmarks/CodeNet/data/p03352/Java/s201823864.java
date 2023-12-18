import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;

        int i = 0;
        while (Math.pow(i,2) <= x) {
            ans = (int) Math.pow(i,2);
            i++;
        }
        System.out.println(ans);

        sc.close();
    }    
}
