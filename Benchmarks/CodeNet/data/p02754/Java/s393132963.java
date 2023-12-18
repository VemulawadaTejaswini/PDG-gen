import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long N=stdIn.nextInt();
        long A=stdIn.nextInt();
        long B=stdIn.nextInt();
        

        System.out.println(N/(A+B)*A+N%(A+B));
        
        
    }

}