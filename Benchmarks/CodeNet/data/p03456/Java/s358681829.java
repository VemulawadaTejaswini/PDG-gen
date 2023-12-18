import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String num = a + b;
        int ab = Integer.parseInt(num);

        boolean state = false;
        for(int i = 0; i <= ab; i++){
            if(i*i == ab){
                state = true;
                break;
            }
        }
        System.out.println(state ? "Yes" :"No");
    }
}
