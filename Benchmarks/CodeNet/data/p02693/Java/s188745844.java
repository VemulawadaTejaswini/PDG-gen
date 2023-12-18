import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        if((K%A==0 && K/A>=1)||(K%B==0 && K/B>=1)){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }
}