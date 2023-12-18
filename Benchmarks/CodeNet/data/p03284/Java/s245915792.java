import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        if(n % k == 0)
          System.out.println("0");
        else
          System.out.println("1");
    }
}