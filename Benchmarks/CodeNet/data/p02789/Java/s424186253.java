import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, M;
        N = scan.nextInt();
        M=scan.nextInt();
        if(M==N){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
