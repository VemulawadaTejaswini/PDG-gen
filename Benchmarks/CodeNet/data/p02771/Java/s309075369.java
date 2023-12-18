import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = stdIn.nextInt();

        int x = 0;

        if(A==B && A != C)
            x = 1;
        if(A==C && A != B)
            x = 1;
        if(B==C && C != A)
            x = 1;
        

        if(x == 1) {
            System.out.println("Yes");
        }else{
            System.out.println("No"); 
        }
    }
}