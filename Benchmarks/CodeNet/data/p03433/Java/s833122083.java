import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int A = scan.nextInt();
        if(N%500 <=A)System.out.println("Yes");
        else System.out.println("No");
    }
}