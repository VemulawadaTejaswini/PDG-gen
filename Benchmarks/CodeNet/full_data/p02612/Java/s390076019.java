import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        if(N%1000==0){
            System.out.println(N%1000);
        }else{
            System.out.println(1000-N%1000);    
        }
    }
}
