import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(scanner.nextLine());
            if(isPrime(x)){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
    
    public static boolean isPrime(int x) {
        if(x == 2){
            return true;
        }
        if(x < 2 || x % 2 == 0){
            return false;
        }

        int i = 3;
        while( i <= Math.sqrt(x) ){
            if(x % i == 0){
                return false;
            }
            i = i + 2;
        }
        return true;
    }
}

