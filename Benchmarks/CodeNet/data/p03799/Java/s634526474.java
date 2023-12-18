import java.util.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long c = sc.nextLong();
        
        if (s > c*2) {
            System.out.println(s);
            return;
        }
        
        long count = 0;
        count += s;
        c -= s*2;
        s = 0;
        
        count += c / 4;
        System.out.println(count);
    }
}