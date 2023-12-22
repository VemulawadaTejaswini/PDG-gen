import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        int n = scanner.nextInt();
        
        int i = 1;
        do {
            int x = i;
            
            if (x % 3 == 0){
                
                result.append(" ");
                result.append(i);
                
            } else {
                
                do {
                    if (x % 10 == 3) {
                        result.append(" ");
                        result.append(i);
                        break;
                    }
                    x /= 10;
                    
                } while(x!=0);
                
            }
        } while(++i <= n);
        
        System.out.println(result);
        
        
    }
}
