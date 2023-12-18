import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num[] = {a + b, a - b, a * b,0};
        
        if(a == 0 || b == 0 ){
            num[3] = 0;
        }else{
            num[3] = a / b;
        }
        Arrays.sort(num);
        System.out.println(num[3]);
        
    }
}
