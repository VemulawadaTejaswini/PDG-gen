import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int answer2 = 0;
        
        if (x * 2 == w && y * 2 == h) {
            answer2 = 1;
        }
        
        long answer = w * h / 2;
        
        System.out.println(answer + " " + answer2);
    }
}
