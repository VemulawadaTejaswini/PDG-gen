import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int diff = b-a;
        int count = 0;
        
        
        
        for(int i=1;i<diff;i++) {
            count +=i;
        } 
        System.out.println(count-a);
        
        
    }
}