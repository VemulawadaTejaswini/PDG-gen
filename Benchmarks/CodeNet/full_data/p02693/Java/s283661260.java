import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if(K==1||(B/K-A/K)>=1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }

    }
}

