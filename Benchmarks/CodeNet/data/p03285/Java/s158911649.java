import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sweet = N;
        while(sweet > 0){
            if(sweet  % 7 == 0){
                System.out.println("Yes");
                break;
            }else{
                sweet =sweet - 4;
            }
        }
        if(sweet < 0){
            System.out.println("No");
        }
        
        
    }
}
