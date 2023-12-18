import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int train = sc.nextInt();
        int taxy = sc.nextInt();

        int result = taxy; 
        if (n*train < taxy) result = n*train; 
        
        System.out.println(result);
    }
}
