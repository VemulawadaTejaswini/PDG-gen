import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int a = 0;
        int b = 0;
        int c = 0;
        long answer = Long.MAX_VALUE;
        long max, min;

            
            // System.out.println(a + " " + b + " " + c);
        // pattern A
        for (int i = 1; i <= h - 2; i++) {
            a = i * w;
            if ((h - i) % 2 == 0) {
                b = (h - i) / 2 * w;
                c = (h - i) / 2 * w;
            } else {
                b = (h - i) / 2 * w;
                c = ((h - i) / 2 + 1) * w;
            }
            
            max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            answer = Math.min(answer, max - min);
        }
        
        // pattern B
        for (int i = 1; i <= h - 1; i++) {
            a = i * w;
            if (w % 2 == 0) {
                b = (h - i) * (w / 2);
                c = (h - i) * (w / 2);
            } else {
                b = (h - i) * (w / 2);
                c = (h - i) * (w / 2 + 1);
            }
            
            max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            answer = Math.min(answer, max - min);
        }
        
        // pattern C
        for (int i = 1; i <= w - 2; i++) {
            a = i * h;
            if ((w - i) % 2 == 0) {
                b = (w - i) / 2 * h;
                c = (w - i) / 2 * h;
            } else {
                b = (w - i) / 2 * h;
                c = ((w - i) / 2 + 1) * h;
            }
            
            max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            answer = Math.min(answer, max - min);
        }
        
        // pattern D
        for (int i = 1; i <= w - 1; i++) {
            a = i * h;
            if (h % 2 == 0) {
                b = (w - i) * (h / 2);
                c = (w - i) * (h / 2);
            } else {
                b = (w - i) * (h / 2);
                c = (w - i) * (h / 2 + 1);
            }
            
            max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            answer = Math.min(answer, max - min);
        }
        
        System.out.println(answer);
    }
}
