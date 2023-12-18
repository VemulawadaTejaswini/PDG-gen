
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = 0;i<Math.pow(10,9);i++){
        if(Math.abs(a-i) == Math.abs(b-i)){
            System.out.println(i);
        }
        }
        
    }
    
}
