import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        while(sum < b){
            sum += a;
            count++;
        }
        
        System.out.println(count);
    }
}