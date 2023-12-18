import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        String result = "NO";
        if(A==5&&B==5&&C==7){
            result = "YES";
        }else if(A==5&&B==7&&C==5){
            result = "YES";
        }else if(A==7&&B==5&&C==5){
            result = "YES";
        }
        System.out.println(result);
        
    }
}
