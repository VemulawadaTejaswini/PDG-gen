import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        String s = sc.next();
        
        if(s.length() <= k) {
            System.out.println(s);
        }else{
            for(int i = 0; i < k; i++){
                System.out.print(s.charAt(i));
            }
            System.out.print("...");
        }
    }
}
