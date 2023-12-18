import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int [] A = {1,3,1,2,1,2,1,1,2,1,2,1};
        if(A[x-1] == A[y-1]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
