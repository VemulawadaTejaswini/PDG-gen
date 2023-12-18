import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A == 1 || B == 1){
            if(A==1 && B==1){
                System.out.println("Draw");
            }else if(A==1){
                System.out.println("Alice");
            }else if(B==1){
                System.out.println("Bob");
            }
            return;
        }
        if(A > B){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
    }
}
