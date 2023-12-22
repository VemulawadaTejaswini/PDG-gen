import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = 0;
        
        for(int i=a; i<=b; i++ ){
            if(c % i == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}

