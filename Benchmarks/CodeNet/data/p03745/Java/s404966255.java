import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean up = true;
        boolean down = true;
        
        int prev = sc.nextInt();
        n--;
        int count = 0;
        while (n-- > 0) {
            int next = sc.nextInt();
            if (prev < next) down = false;
            if (prev > next) up = false;
            
            if (!up && !down) {
                count++;
                up = true;
                down = true;
            }
            prev = next;
        }
        System.out.println(count+1);
        
    }
}