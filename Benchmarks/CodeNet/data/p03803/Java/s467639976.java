import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A==1){
            A = A + 13;
        }
        if(B==1){
            B = B + 13;
        }
        
        if(A > B){
            System.out.println("Alice");
        }else if(A == B){
            System.out.println("Draw");
        }else if(A < B){
            System.out.println("Bob");
        }
    }
}