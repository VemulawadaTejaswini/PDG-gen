import java.util.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long c = sc.nextLong();
        
        
        long count = 0;
        
        if (s*2 == c) {
            System.out.println(s);
        } else if (s*2 < c) {
            count += s;
            c -= s * 2;
            s = 0;
            count += (c / 4);
            System.out.println(count);
        } else {
            System.out.println(c/2);
        }
    }
}