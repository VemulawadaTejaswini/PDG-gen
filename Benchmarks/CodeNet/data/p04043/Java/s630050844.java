import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int A = 5;
        int B = 7;
        int C = 5;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == A && b == B && c == C){
            System.out.println("YES");
        } else if(a == B && b == C && c == A){
            System.out.println("YES");
        }else if(a == C && b == A && c == B){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    
}