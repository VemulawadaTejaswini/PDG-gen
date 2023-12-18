
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int A= Input.nextInt();
        int B=Input.nextInt();
        int C= Input.nextInt();
        
        int X = Math.abs(A-B);
        int Y = Math.abs(C-B);
        
        if(X==Y){System.out.println("YES");}else{System.out.println("NO");}
      
    }
}

//Learn Before You Earn
