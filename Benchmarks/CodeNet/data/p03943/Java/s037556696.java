import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int[] candy = {a, b, c};
        
        Arrays.sort(candy);
        
        if (candy[0] == candy[1] + candy[2]) {
            System.out.println("Yes");
        }
        
        else {
            System.out.println("No");
        }
    }     
}
