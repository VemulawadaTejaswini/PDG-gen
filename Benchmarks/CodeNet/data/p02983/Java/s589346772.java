
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        
        int result = 0;
        
        for (int i = L; i <= R; i++){
            for (int j = i + 1; j <= R; j++){
                int mod = (i * j) % 2019;
                if(result > mod || result == 0) result = mod;
            }
        }
        
        System.out.println(result);
    }
}