import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int k = sc.nextInt();
        if(max - min > k)
            System.out.println(":(");
        else
            System.out.println("Yay!");
    }
}
