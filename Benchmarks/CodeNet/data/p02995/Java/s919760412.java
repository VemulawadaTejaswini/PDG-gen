import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        long dc = sc.nextLong();
        long dd = sc.nextLong();
        long ans = 0;
        for(long i = 0; i <= max - min; i++){
            long value = min + i;
            if(value % dc != 0 && value % dd != 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}