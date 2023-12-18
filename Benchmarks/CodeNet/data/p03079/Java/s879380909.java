import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A==B && A==C && B==C){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
