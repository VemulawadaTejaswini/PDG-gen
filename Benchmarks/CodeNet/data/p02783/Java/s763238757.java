import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        
        int count;
        
        count = H/A;
        if(H%A != 0){
            count++;
        }
        System.out.println(count);
    }
}
