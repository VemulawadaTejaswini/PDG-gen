import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        int count = 0;
        while(true) {
            if( Math.floor(Math.pow(2, count)) * X <= Y ) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
